package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {


    @Mock
    ProjectRepository projectRepository;

    @Mock
    ProjectMapper projectMapper;

    @InjectMocks
    ProjectServiceImpl projectService;


    @Test
    void getByProjectCode_test(){
        Project project = new Project();
        ProjectDTO projectDTO= new ProjectDTO();
        when(projectRepository.findByProjectCode(anyString())).thenReturn(project);
        when(projectMapper.convertToDto(project)).thenReturn(projectDTO);

        ProjectDTO projectDto1 = projectService.getByProjectCode(anyString());

        verify(projectRepository).findByProjectCode(anyString());
        verify(projectMapper).convertToDto(any(Project.class));

        assertNotNull(projectDto1);

    }

    @Test
    void getByProjectCode_exception_test(){

        when(projectRepository.findByProjectCode("")).thenThrow(new RuntimeException("Project not found"));

        Throwable exception= assertThrows(RuntimeException.class, () -> projectService.getByProjectCode(""));

        assertEquals(exception.getMessage(), "Project not Found");

    }


    @Test
    void save_test(){
        Project project = new Project();
        ProjectDTO projectDTO= new ProjectDTO();

        when(projectMapper.convertToEntity(projectDTO)).thenReturn(project);
        when(projectRepository.save(project)).thenReturn(project);

        projectService.save(projectDTO);
        verify(projectRepository).save(project);
    }

}