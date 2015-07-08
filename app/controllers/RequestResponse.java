package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import models.Comment;
import models.News;
import models.NewsCollection;
import models.NewsTags;
import models.Tags;
import models.Users;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class RequestResponse extends Controller {

	public static Result index() {
		String json = "{'name':'lxx','age':'180'}";

		return ok();

	}

	public static Result login() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String pwd = din.get("pwd");
		Users beanuser = Users.findByid(userid);
		LogsManage.getInstance().setEvent(userid, "login", pwd);
		if (beanuser == null) {
			return ok("err_notfound");
		}
		if (beanuser.pwd.equals(pwd)) {

			try {
				JSONObject ja = new JSONObject();
				ja.put("userid", beanuser.userid);
				ja.put("username", beanuser.username);
				return ok(ja.toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return ok("err");
		} else {
			return ok("err_pwd");
		}
	}

	public static Result regist() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String pwd = din.get("pwd");
		Users ut = Users.findByid(userid);
		LogsManage.getInstance().setEvent(userid, "regist", pwd);
		if (ut == null) {
			Users beanuser = new Users();
			beanuser.userid = userid;
			beanuser.pwd = pwd;
			beanuser.registTime = new Date();
			beanuser.username = "牛逼的用户951" + Users.findQuantity();
			beanuser.save();
			try {
				JSONObject ja = new JSONObject();
				ja.put("userid", beanuser.userid);
				ja.put("username", beanuser.username);
				return ok(ja.toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ok("err");
		} else

			return ok("err_repeat");
	}

	public static Result getCollection() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		LogsManage.getInstance().setEvent(userid, "getCollection", "");
		List<NewsCollection> lnc = NewsCollection.findByUserid(userid);
		JSONArray ja = new JSONArray();
		for (NewsCollection newsCollection : lnc) {
			ja.put(new JSONObject(News.findByid(newsCollection.newsid).toMap()));
		}

		return ok(ja.toString());
	}

	public static Result usertagGet() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		LogsManage.getInstance().setEvent(userid, "usertagGet", "");
		return ok(Users.findByid(userid).userTags);
	}

	public static Result usertagUpdate() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String tags = din.get("taglist");
		LogsManage.getInstance().setEvent("userid", "usertagUpdate", tags);
		Users us = Users.findByid(userid);
		us.userTags = tags;
		us.save();
		return ok("ok");
	}

	public static Result getTags() {
		List<Tags> ltg = Tags.findAll();
		LogsManage.getInstance().setEvent("system", "getTags", "all");
		JSONArray ja = new JSONArray();
		for (Tags tags : ltg) {
			ja.put(new JSONObject(tags.toMap()));
		}
		return ok(ja.toString());
	}

	public static Result getNewsListByTags() {
		DynamicForm din = Form.form().bindFromRequest();
		String taglist = din.get("taglist");
		LogsManage.getInstance().setEvent("system", "getNewsListByTags",
				taglist);
		try {
			JSONArray js = new JSONArray(taglist);
			List<Long> ls = new ArrayList<>();
			for (int i = 0; i < js.length(); i++) {
				ls.add(Long.parseLong(js.getString(i)));
			}
			List<List<NewsTags>> lns = new NewsManage().fingByTags(ls);
			JSONArray ja = new JSONArray();
			for (NewsTags newst : lns.get(0)) {
				ja.put(new JSONObject(News.findByid(newst.newsid).toMap()));
			}
			JSONArray jb = new JSONArray();
			for (NewsTags newst : lns.get(1)) {
				jb.put(new JSONObject(News.findByid(newst.newsid).toMap()));
			}
			JSONArray jc = new JSONArray();
			jc.put(ja);
			jc.put(jb);
			return ok(jc.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ok("err");
	}

	public static Result getnewslatest() {
		List<News> lns = new NewsManage().findLatestNews();
		LogsManage.getInstance().setEvent("system", "getnewslatest", "last");
		JSONArray ja = new JSONArray();
		for (News news : lns) {
			ja.put(new JSONObject(news.toMap()));
		}
		return ok(ja.toString());
	}

	public static Result search(String kwd) {
		LogsManage.getInstance().setEvent("system", "search", kwd);
		List<News> lns = new NewsManage().search(kwd);
		JSONArray ja = new JSONArray();
		for (News news : lns) {
			ja.put(new JSONObject(news.toMap()));
		}
		return ok(ja.toString());
	}

	public static Result comment() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		String comment = din.get("commentContent");
		LogsManage.getInstance().setEvent("userid", "comment",
				newsid + ":" + comment);
		Comment cm = new Comment();
		cm.userid = userid;
		cm.newsid = Long.parseLong(newsid);
		cm.commentContent = comment;
		cm.save();
		return ok("ok");
	}

	public static Result collectionAdd() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		LogsManage.getInstance().setEvent("userid", "collectionAdd", newsid);
		NewsCollection nc = new NewsCollection();
		nc.userid = userid;
		nc.newsid = Long.parseLong(newsid);
		nc.registTime = new Date();
		nc.save();
		return ok("ok");
	}

	public static Result collectionRemove() {
		DynamicForm din = Form.form().bindFromRequest();
		String userid = din.get("userid");
		String newsid = din.get("newsid");
		LogsManage.getInstance().setEvent("userid", "collectionRemove", newsid);
		NewsCollection lnc = NewsCollection.findByColl(userid,
				Long.parseLong(newsid));
		lnc.delete();
		return ok("ok");
	}
}
