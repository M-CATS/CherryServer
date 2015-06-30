package controllers;

import java.util.Date;
import java.util.List;

import models.Comment;
import models.News;
import models.NewsCollection;
import models.Users;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class RequestResponse extends Controller {

	public static Result index() {
		String json = "['name':'lxx','age':'180']";
		// DynamicForm din = Form.form().bindFromRequest();
		// String sq = din.get("quantity");
		return ok(json);
	}

	public static Result login() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String pwd = din.get("password");
		Users beanuser = Users.findByid(userid);
		if (beanuser.pwd.equals(pwd)) {
			//
			return ok();
		} else {
			//
			return ok();
		}
	}

	public static Result regist() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String pwd = din.get("password");
		Users beanuser = new Users();
		beanuser.userid = userid;
		beanuser.pwd = pwd;
		beanuser.registTime = new Date();
		beanuser.username = "牛逼的用户951" + Users.findQuantity();
		beanuser.save();
		return ok();
	}

	public static Result getNewsListByTags(String tags) {
		return ok();
	}

	public static Result getnewslatest() {
		List<News> lns=new NewsManage().findLatestNews();
		//
		return ok();
	}

	public static Result search(String kwd) {
		List<News> lns= new NewsManage().search(kwd);
		//
		return ok();
	}

	public static Result userTagsUpdate() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String tags = din.get("tags");
		Users ufi=Users.findByid(userid);
		ufi.userTags=tags;
		ufi.save();
		return ok();
	}

	public static Result comment() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		String comment = din.get("comment");
		Comment cm=new Comment();
		cm.userid=userid;
		cm.newsid=Long.parseLong(newsid);
		cm.commentContent=comment;
		cm.save();
		return ok();
	}

	public static Result collectionAdd() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		NewsCollection nc=new NewsCollection();
		nc.userid=userid;
		nc.newsid=Long.parseLong(newsid);
		nc.redisttime=new Date();
		nc.save();
		return ok();
	}

	public static Result collectionRemove() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		List<NewsCollection> lnc=NewsCollection.findByColl(userid, Long.parseLong(newsid));
		//
		return ok();
	}
}
