package main;
import configs.ProjectConfiguration;
import domain.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        //Creating an instance of the Spring Context
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Tyfah");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);

        commentService.deleteComment(comment);

//        log.info(value);

    }
}
