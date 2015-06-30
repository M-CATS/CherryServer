package controllers;

import java.util.*;
import models.Comment;
import models.News;
import models.NewsDetail;
import play.*;
import play.mvc.*;
import views.html.*;

public class WebPage extends Controller {

    public static Result news(Long newsid) {
    	
    	NewsDetail n=NewsDetail.findByid(newsid);
    	List<Comment> c=Comment.findByNewsid(newsid);
        return ok(NewsInfo.render(n,c));
    }

}
