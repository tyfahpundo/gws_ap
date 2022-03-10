package repository;

import domain.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
