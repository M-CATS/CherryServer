# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  commentid                 bigint auto_increment not null,
  userid                    varchar(255),
  newsid                    bigint,
  comment_content           varchar(255),
  regist_time               datetime,
  delete_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_comment primary key (commentid))
;

create table logs (
  logid                     bigint auto_increment not null,
  userid                    varchar(255),
  eventterget               varchar(255),
  eventcontent              varchar(255),
  event_time                datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_logs primary key (logid))
;

create table news (
  newsid                    bigint auto_increment not null,
  news_title                varchar(255),
  news_summary              varchar(255),
  img_url                   varchar(255),
  page_url                  varchar(255),
  create_time               datetime,
  remove_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_news primary key (newsid))
;

create table news_collection (
  collectionid              bigint auto_increment not null,
  newsid                    bigint,
  userid                    varchar(255),
  regist_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_news_collection primary key (collectionid))
;

create table news_detail (
  detailid                  bigint auto_increment not null,
  news_full_title           varchar(255),
  news_summary              varchar(255),
  news_content              varchar(255),
  editor                    varchar(255),
  img_url                   varchar(255),
  img_width                 varchar(255),
  img_height                varchar(255),
  regist_time               datetime,
  delete_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_news_detail primary key (detailid))
;

create table news_tags (
  ntid                      bigint auto_increment not null,
  newsid                    bigint,
  tagid                     bigint,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_news_tags primary key (ntid))
;

create table tags (
  tagid                     bigint auto_increment not null,
  tag_name                  varchar(255),
  regist_time               datetime,
  delete_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_tags primary key (tagid))
;

create table users (
  userid                    varchar(255) not null,
  username                  varchar(255),
  pwd                       varchar(255),
  user_tags                 varchar(255),
  regist_time               datetime,
  delete_time               datetime,
  def                       varchar(255),
  remark                    varchar(255),
  constraint pk_users primary key (userid))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table comment;

drop table logs;

drop table news;

drop table news_collection;

drop table news_detail;

drop table news_tags;

drop table tags;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

