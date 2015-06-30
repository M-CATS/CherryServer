package controllers;

import models.News;
import play.*;
import play.mvc.*;
import views.html.*;

public class WebPage extends Controller {

    public static Result news(Long newsid) {
    	
    	News n=News.findByid(newsid);
        return ok(NewsInfo.render(n));
    }

}
