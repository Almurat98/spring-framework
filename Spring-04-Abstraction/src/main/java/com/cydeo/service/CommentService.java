package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepo;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepo commentRepo;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepo = commentRepo;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
