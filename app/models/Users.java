package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;
import com.avaje.ebean.*;
import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class Users extends Model {

	private static final long serialVersionUID = 1L;

	
    public String userid;      //账号
	public String username;    //昵称
	public String pwd;         //密码
	public String userTags;    //用户标签
	public Date registTime;    //注册时间
	public Date deleteTime;    //注销时间
	public String def;         
	public String remark;

	public static Model.Finder<String, Users> find = new Model.Finder<String, Users>(
			String.class, Users.class);

	
	public static Users findByid(String userid){
		return find.where().eq("userid", userid).findUnique();
	}
	public static int findQuantity(){
		return find.findRowCount();
	}

}
