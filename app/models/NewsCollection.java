package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class NewsCollection extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long collectionid; // 收藏id

	public Long newsid; // 新闻id
	public String userid; // 用户id
	public Date registTime; // 收藏时间
	public String def;
	public String remark;

	public static Model.Finder<Long, NewsCollection> find = new Model.Finder<Long, NewsCollection>(
			Long.class, NewsCollection.class);

	public static NewsCollection findByid(Long detailid) {
		return find.byId(detailid);
	}

	public static List<NewsCollection> findByUserid(String userid) {
		return find.where().eq("userid", userid).findList();
	}

	public static NewsCollection findByColl(String userid, Long newsid) {
		return find.where().eq("userid", userid).eq("newsid", newsid)
				.findUnique();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("collectionid", this.collectionid.toString());
		map.put("newsid", this.newsid.toString());
		map.put("userid", this.userid);
		map.put("registTime", (this.registTime == null) ? null
				: this.registTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}

}
