package controllers;

import java.util.Date;

import models.NewsDetail;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class NewsServer extends Controller {

	public static Result addTags() {
		DynamicForm din = Form.form().bindFromRequest();
		String tagname = din.get("tagname");
		new NewsManage().addTag(tagname);
		return ok();
	}

	public static Result addNews() {
		DynamicForm din = Form.form().bindFromRequest();
		String newsFullTitle = din.get("newsFullTitle");
		String newsSummary = din.get("newsSummary");
		String newsContent = din.get("newsContent");
		String editor = din.get("editor");
		String tagname = din.get("tagname");
		String imgUrl = din.get("imgUrl");
		String imgWidth = din.get("imgWidth");
		String imgHeight = din.get("imgHeight");
		String registTime = din.get("registTime");
		NewsDetail dt = new NewsDetail();
		dt.newsFullTitle = newsFullTitle;
		dt.newsSummary = newsSummary;
		dt.newsContent = newsContent;
		dt.editor = editor;
		dt.imgUrl = imgUrl;
		dt.imgWidth = imgWidth;
		dt.imgHeight = imgHeight;
		dt.registTime = new Date();
		dt.save();
		new NewsManage().addNews(dt);
		return ok();
	}

}
