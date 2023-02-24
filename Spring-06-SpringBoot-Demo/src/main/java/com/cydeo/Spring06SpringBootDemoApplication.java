package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring06SpringBootDemoApplication {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Oreo is sleeping");

        ApplicationContext container =  SpringApplication.run(Spring06SpringBootDemoApplication.class, args);

        CommentService commentService= container.getBean(CommentService.class);
        commentService.publishComment(comment);

    }

}
