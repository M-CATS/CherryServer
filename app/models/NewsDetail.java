package models;

import play.data.validation.*;

import javax.persistence.*;

import java.util.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import scala.collection.parallel.ParIterableLike.Find;

@Entity
public class NewsDetail extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    public Long detailid;           //新闻id
	
	public String newsFullTitle;    //完整的标题
	public String newsSummary;      //新闻概要
	public String newsContent;      //详细内容
	public String editor;           //作者
	public String imgUrl;           //图片路径
	public String imgWidth;         //图片宽度
	public String imgHeight;        //图片高度
	public Date registTime;         //发布时间
	public Date deleteTime;         //删除时间
	public String def;
	public String remark;

	public static Model.Finder<Long, NewsDetail> find = new Model.Finder<Long, NewsDetail>(
			Long.class, NewsDetail.class);

	
	public static NewsDetail findByid(Long detailid){
		return find.byId(detailid);
	}
	public  Map<String ,String> toMap(){
		Map<String ,String > map=new HashMap<String ,String>();
		map.put("detailid", this.detailid.toString());
		map.put("newsFullTitle", this.newsFullTitle);
		map.put("newsSummary", this.newsSummary);
		map.put("newsContent", this.newsContent);
		map.put("editor", this.editor);
		map.put("imgUrl", this.imgUrl);
		map.put("imgWidth", this.imgWidth);
		map.put("imgHeight", this.imgHeight);
		map.put("registTime", (this.registTime == null) ? null
				: this.registTime.toString());
		map.put("deleteTime", (this.deleteTime == null) ? null : this.deleteTime.toString());
		map.put("def", this.def);
		map.put("remark", this.remark);
		return map;
	}

}
