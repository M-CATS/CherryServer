package models;

import play.data.validation.*;

import javax.persistence.*;

import org.springframework.context.annotation.Primary;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class Users extends Model {

	private static final long serialVersionUID = 1L;
	@Id
	public String userid; // 账号
	public String username; // 昵称
	public String pwd; // 密码
	public String userTags; // 用户标签
	public Date registTime; // 注册时间
	public Date deleteTime; // 注销时间
	public String def;
	public String remark;

	public static Model.Finder<String, Users> find = new Model.Finder<String, Users>(
			String.class, Users.class);

	public static Users findByid(String userid) {
		return find.where().eq("userid", userid).findUnique();
	}

	public static int findQuantity() {
		return find.findRowCount();
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", this.userid);
		map.put("username", this.username);
		map.put("pwd", this.pwd);
		map.put("userTags", this.userTags);
		map.put("registTime", (this.registTime == null) ? null
				: this.registTime.toString());
		map.put("deleteTime", (this.deleteTime == null) ? null
				: this.deleteTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}

}
