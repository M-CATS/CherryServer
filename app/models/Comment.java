package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class Comment extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long commentid; // 评论id

	public String userid; // 用户id
	public Long newsid; // 新闻id
	public String commentContent; // 评论内容
	public Date registTime; // 发布时间
	public Date deleteTime; // 删除时间
	public String def;
	public String remark;

	public static Model.Finder<Long, Comment> find = new Model.Finder<Long, Comment>(
			Long.class, Comment.class);

	public static Comment findByid(Long detailid) {
		return find.byId(detailid);
	}

	public static List<Comment> findByNewsid(Long newsid) {
		return find.where().eq("newsid", newsid).findList();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("commentid", this.commentid.toString());
		map.put("userid", this.userid);
		map.put("newsid", this.newsid.toString());
		map.put("commentContent", this.commentContent);
		map.put("registTime", (this.registTime == null) ? null
				: this.registTime.toString());
		map.put("deleteTime", (this.deleteTime == null) ? null
				: this.deleteTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}
}
