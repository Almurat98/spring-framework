package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Oreo is sleeping");

        ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);

       CommentService cs1= container.getBean(CommentService.class);
       CommentService cs2 = container.getBean(CommentService.class);

        //use @scope:prototype
//        System.out.println(cs1);
//        System.out.println(cs2);
//        System.out.println(cs1==cs2);

    }
}