package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")

public class CommentService {
    private final CommentRepo commentRepo;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo,@Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){
        this.commentRepo = commentRepo;
        this.commentNotificationProxy = commentNotificationProxy;
        //use @lazy
//        System.out.println("hello");
    }

    public void publishComment(Comment comment){
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
