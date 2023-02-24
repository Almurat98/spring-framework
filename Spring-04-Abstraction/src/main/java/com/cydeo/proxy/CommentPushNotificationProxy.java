package com.cydeo.proxy;

import com.cydeo.model.Comment;

public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for :  "+ comment.getText());
    }
}
