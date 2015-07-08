package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class NewsTags extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long ntid; // id

	public Long newsid; // 新闻id
	public Long tagid; // 标签id
	public String def;
	public String remark;

	public static Model.Finder<Long, NewsTags> find = new Model.Finder<Long, NewsTags>(
			Long.class, NewsTags.class);

	public static NewsTags findByid(Long detailid) {
		return find.byId(detailid);
	}

	public static List<NewsTags> findByTags(Long tagid) {
		return find.where().eq("tagid", tagid).findList();
	}

	public static NewsTags findIdAndTags(Long newsid, Long tagid) {
		return find.where().eq("newsid", newsid).eq("tagid", tagid)
				.findUnique();
	}

	public static List<NewsTags> findByNews(Long newsid) {
		return find.where().eq("newsid", newsid).findList();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ntid", this.ntid.toString());
		map.put("newsid", this.newsid.toString());
		map.put("tagid", this.tagid.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}

}
