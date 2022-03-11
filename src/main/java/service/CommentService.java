package service;

import domain.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger log = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        log.info("Publishing comment: "+comment.getText());
    }
    @ToLog
    public void deleteComment(Comment comment) {
        log.info("Deleting comment:" + comment.getText());
    }
    public void editComment(Comment comment) {
        log.info("Editing comment:" + comment.getText());
    }
}
