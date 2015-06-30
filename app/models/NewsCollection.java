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
	public Date redisttime; // 收藏时间
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

	public static List<NewsCollection> findByColl(String userid, Long newsid) {
		return find.where().eq("userid", newsid).eq("newsid", newsid)
				.findList();
	}

}
