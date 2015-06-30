package controllers;

import java.util.List;
import models.*;

public class NewsManage {
	//通过关键词标题查找
	public List<News> search(String keyword) {
		return News.findByKeyWords(keyword);
	}
	//找到最新的新闻
	public List<News> findLatestNews() {
		//数量
		return News.findByTime(30);
	}
	//通过一串tag找新闻
	public List<News> fingByTags(List<String> tag) {
		return null;
	}
	//增加tag(要你没用)
	public void addTag() {

	}
}
