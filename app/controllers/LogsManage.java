package controllers;

import java.util.Date;

import models.Logs;

public class LogsManage {
	private static LogsManage oneInstance;

	private LogsManage() {
	}

	public static LogsManage getInstance() {
		if (oneInstance == null) {
			oneInstance = new LogsManage();
		}
		return oneInstance;
	}

	public void setEvent(String user, String terget, String content) {
		Logs ls=new Logs();
		ls.userid=user;
		ls.eventterget=terget;
		ls.eventcontent=content;
		ls.eventTime=new Date();
		ls.save();
	}
}
