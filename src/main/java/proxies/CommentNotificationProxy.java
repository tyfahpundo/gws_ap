package proxies;

import domain.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
