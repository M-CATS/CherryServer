package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class WebPage extends Controller {

    public static Result news(Long newsid) {
    	
        return ok();
    }

}
