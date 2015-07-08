package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import models.*;

public class NewsManage {
	// 通过关键词标题查找
	public List<News> search(String keyword) {
		return News.findByKeyWords(keyword);
	}

	// 找到最新的新闻
	public List<News> findLatestNews() {
		// 数量
		return News.findByTime(30);
	}

	// 通过一串tag找新闻
	public List<List<NewsTags>> fingByTags(List<Long> tag) {

		List<NewsTags> rs = NewsTags.findByTags(tag.get(0));
		List<NewsTags> csr = rs;
		tag.remove(0);
		List<NewsTags> rsr = new ArrayList<NewsTags>();
		List<List<NewsTags>> mp = new ArrayList<List<NewsTags>>();

		for (Long tid : tag) {

			for (NewsTags ns : rs) {
				NewsTags n = NewsTags.findIdAndTags(ns.newsid, tid);
				if (n != null)
					rsr.add(n);
			}
			csr = rs;
			rs = rsr;
			rsr=new ArrayList<NewsTags>();
			if (rsr.size() == 0) {
				break;
			}
		}
		mp.add(rs);
		mp.add(csr);
		return mp;
	}

	// 增加tag(要你没用)
	public void addTag(String tagname) {
		Tags tg=new Tags();
		tg.tagName=tagname;
		tg.registTime=new Date();
		tg.save();
	}
	
	public void addNews(NewsDetail dt){
		News ns=new News();
		ns.newsid=dt.detailid;
		ns.imgUrl=dt.imgUrl;
		ns.newsTitle=dt.newsFullTitle;
		ns.newsSummary=dt.newsSummary;
		ns.createTime=dt.registTime;
		ns.pageUrl=global.getWEBPAGEROUTE()+dt.detailid;
		ns.save();
	}
}
