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
public class Logs extends Model {

	private static final long serialVersionUID = 1L;
	@Id
	public Long logid;      // logid
	public String userid;   // 事件人
	public String eventterget;  // 事件目标
	public String eventcontent; // 事件内容
	public Date eventTime;  // 事件时间
	public String def;
	public String remark;

	public static Model.Finder<Long, Logs> find = new Model.Finder<Long, Logs>(
			Long.class, Logs.class);

	public static Logs findByid(Long newsid) {
		return find.byId(newsid);
	}
	
	public static List<Logs> findlatist(int limit) {
		return find.orderBy("eventTime").setMaxRows(limit).findList();
	}
	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("newsid", this.logid.toString());
		map.put("newsTitle", this.userid);
		map.put("newsSummary", this.eventterget);
		map.put("imgUrl", this.eventcontent);
		map.put("createTime", (this.eventTime == null) ? null
				: this.eventTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		
		return map;
	}
}
