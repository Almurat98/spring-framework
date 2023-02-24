package com.cydeo.repository;

import com.cydeo.model.Comment;

public interface CommentRepo {
    void storeComment(Comment comment);
}
