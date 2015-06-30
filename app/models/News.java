package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;
import com.avaje.ebean.*;
import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class News extends Model {

	private static final long serialVersionUID = 1L;

	
    public Long newsid;             //新闻id
	public String newsTitle;        //新闻标题
	public String newsSummary;      //新闻概要
	public String imgUrl;           //图片路径
	public String pageUrl;          //网页路径
	public String createTime;
	public String removeTime;
	public String def;
	public String remark;

	public static Model.Finder<Long, News> find = new Model.Finder<Long, News>(
			Long.class, News.class);

	
	public static News findByid(Long newsid){
		return find.byId(newsid);
	}
	public static List<News> findByKeyWords(String keyword){
		return find.where().like("newsTitle", "%"+keyword+"%").findList();
	}
	public static List<News> findByTime(int limit){
		return find.orderBy("createTime").setMaxRows(limit).findList();
	}

}
