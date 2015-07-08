package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class Tags extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long tagid; // tagid

	public String tagName; // tag名字
	public Date registTime; // 发布时间
	public Date deleteTime; // 删除时间
	public String def;
	public String remark;

	public static Model.Finder<Long, Tags> find = new Model.Finder<Long, Tags>(
			Long.class, Tags.class);

	public static Tags findByid(Long detailid) {
		return find.byId(detailid);
	}

	public static Tags findByName(String tagname) {
		return find.where().eq("tagName", tagname).findUnique();
	}

	public static List<Tags> findAll() {
		return find.findList();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("tagid", this.tagid.toString());
		map.put("tagName", this.tagName);
		map.put("registTime", (this.registTime == null) ? null
				: this.registTime.toString());
		map.put("deleteTime", (this.deleteTime == null) ? null
				: this.deleteTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}
}
