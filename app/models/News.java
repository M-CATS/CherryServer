package models;

import play.data.validation.*;

import javax.persistence.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class News extends Model {

	private static final long serialVersionUID = 1L;
	@Id
	public Long newsid; // 新闻id
	public String newsTitle; // 新闻标题
	public String newsSummary; // 新闻概要
	public String imgUrl; // 图片路径
	public String pageUrl; // 网页路径
	public Date createTime;
	public Date removeTime;
	public String def;
	public String remark;

	public static Model.Finder<Long, News> find = new Model.Finder<Long, News>(
			Long.class, News.class);

	public static News findByid(Long newsid) {
		return find.byId(newsid);
	}

	public static List<News> findByKeyWords(String keyword) {
		return find.where().like("newsTitle", "%" + keyword + "%").findList();
	}

	public static List<News> findByTime(int limit) {
		return find.orderBy("createTime").setMaxRows(limit).findList();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("newsid", this.newsid.toString());
		map.put("newsTitle", this.newsTitle);
		map.put("newsSummary", this.newsSummary);
		map.put("imgUrl", this.imgUrl);
		map.put("pageUrl", this.pageUrl);
		map.put("createTime", (this.createTime == null) ? null
				: this.createTime.toString());
		map.put("removeTime", (this.removeTime == null) ? null
				: this.removeTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		JSONArray ja = new JSONArray();
		List<NewsTags> nt = NewsTags.findByNews(this.newsid);
		for (NewsTags newsTags : nt) {
			ja.put(new JSONObject(Tags.findByid(newsTags.tagid).toMap()));
		}
		map.put("tagsmark", ja.toString());
		return map;
	}
}
