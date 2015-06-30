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
    public Long ntid;        //id
	
	public Long newsid;      //新闻id
	public Long tagid;       //标签id
	public String def;
	public String remark;

	public static Model.Finder<Long, NewsTags> find = new Model.Finder<Long, NewsTags>(
			Long.class, NewsTags.class);

	
	public static NewsTags findByid(Long detailid){
		return find.byId(detailid);
	}

}
