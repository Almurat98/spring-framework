package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepo implements CommentRepo{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment : "+comment.getText());
    }
}
