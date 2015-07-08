// @SOURCE:E:/git/CherryServer/conf/routes
// @HASH:ca80d9db82fcb25c4d130e83dd71b6cc9ff95487
// @DATE:Wed Jul 08 15:00:35 CST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_WebPage_news2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newspage/"),DynamicPart("newsid", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_RequestResponse_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response"))))
        

// @LINE:16
private[this] lazy val controllers_RequestResponse_login4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/login"))))
        

// @LINE:17
private[this] lazy val controllers_RequestResponse_regist5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/regist"))))
        

// @LINE:18
private[this] lazy val controllers_RequestResponse_getCollection6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/usercollection"))))
        

// @LINE:19
private[this] lazy val controllers_RequestResponse_usertagGet7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/usertag/get"))))
        

// @LINE:20
private[this] lazy val controllers_RequestResponse_usertagUpdate8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/usertag/update"))))
        

// @LINE:21
private[this] lazy val controllers_RequestResponse_getNewsListByTags9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/getnewsbytags"))))
        

// @LINE:22
private[this] lazy val controllers_RequestResponse_getnewslatest10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/getnewslatest"))))
        

// @LINE:23
private[this] lazy val controllers_RequestResponse_search11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/search/"),DynamicPart("kwd", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_RequestResponse_getTags12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/gettags"))))
        

// @LINE:25
private[this] lazy val controllers_RequestResponse_comment13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/comment"))))
        

// @LINE:26
private[this] lazy val controllers_RequestResponse_collectionAdd14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/collection/add"))))
        

// @LINE:27
private[this] lazy val controllers_RequestResponse_collectionRemove15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("response/collection/remove"))))
        

// @LINE:30
private[this] lazy val controllers_NewsServer_addTags16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news/addtags"))))
        

// @LINE:31
private[this] lazy val controllers_NewsServer_addNews17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news/addnews"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newspage/$newsid<[^/]+>""","""controllers.WebPage.news(newsid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response""","""controllers.RequestResponse.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/login""","""controllers.RequestResponse.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/regist""","""controllers.RequestResponse.regist()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/usercollection""","""controllers.RequestResponse.getCollection()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/usertag/get""","""controllers.RequestResponse.usertagGet()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/usertag/update""","""controllers.RequestResponse.usertagUpdate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/getnewsbytags""","""controllers.RequestResponse.getNewsListByTags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/getnewslatest""","""controllers.RequestResponse.getnewslatest()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/search/$kwd<[^/]+>""","""controllers.RequestResponse.search(kwd:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/gettags""","""controllers.RequestResponse.getTags()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/comment""","""controllers.RequestResponse.comment()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/collection/add""","""controllers.RequestResponse.collectionAdd()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """response/collection/remove""","""controllers.RequestResponse.collectionRemove()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news/addtags""","""controllers.NewsServer.addTags()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news/addnews""","""controllers.NewsServer.addNews()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_WebPage_news2(params) => {
   call(params.fromPath[Long]("newsid", None)) { (newsid) =>
        invokeHandler(controllers.WebPage.news(newsid), HandlerDef(this, "controllers.WebPage", "news", Seq(classOf[Long]),"GET", """ newspage""", Routes.prefix + """newspage/$newsid<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_RequestResponse_index3(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.index(), HandlerDef(this, "controllers.RequestResponse", "index", Nil,"GET", """ requestrespnse""", Routes.prefix + """response"""))
   }
}
        

// @LINE:16
case controllers_RequestResponse_login4(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.login(), HandlerDef(this, "controllers.RequestResponse", "login", Nil,"POST", """""", Routes.prefix + """response/login"""))
   }
}
        

// @LINE:17
case controllers_RequestResponse_regist5(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.regist(), HandlerDef(this, "controllers.RequestResponse", "regist", Nil,"POST", """""", Routes.prefix + """response/regist"""))
   }
}
        

// @LINE:18
case controllers_RequestResponse_getCollection6(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.getCollection(), HandlerDef(this, "controllers.RequestResponse", "getCollection", Nil,"POST", """""", Routes.prefix + """response/usercollection"""))
   }
}
        

// @LINE:19
case controllers_RequestResponse_usertagGet7(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.usertagGet(), HandlerDef(this, "controllers.RequestResponse", "usertagGet", Nil,"POST", """""", Routes.prefix + """response/usertag/get"""))
   }
}
        

// @LINE:20
case controllers_RequestResponse_usertagUpdate8(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.usertagUpdate(), HandlerDef(this, "controllers.RequestResponse", "usertagUpdate", Nil,"POST", """""", Routes.prefix + """response/usertag/update"""))
   }
}
        

// @LINE:21
case controllers_RequestResponse_getNewsListByTags9(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.getNewsListByTags(), HandlerDef(this, "controllers.RequestResponse", "getNewsListByTags", Nil,"POST", """""", Routes.prefix + """response/getnewsbytags"""))
   }
}
        

// @LINE:22
case controllers_RequestResponse_getnewslatest10(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.getnewslatest(), HandlerDef(this, "controllers.RequestResponse", "getnewslatest", Nil,"GET", """""", Routes.prefix + """response/getnewslatest"""))
   }
}
        

// @LINE:23
case controllers_RequestResponse_search11(params) => {
   call(params.fromPath[String]("kwd", None)) { (kwd) =>
        invokeHandler(controllers.RequestResponse.search(kwd), HandlerDef(this, "controllers.RequestResponse", "search", Seq(classOf[String]),"GET", """""", Routes.prefix + """response/search/$kwd<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_RequestResponse_getTags12(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.getTags(), HandlerDef(this, "controllers.RequestResponse", "getTags", Nil,"GET", """""", Routes.prefix + """response/gettags"""))
   }
}
        

// @LINE:25
case controllers_RequestResponse_comment13(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.comment(), HandlerDef(this, "controllers.RequestResponse", "comment", Nil,"POST", """""", Routes.prefix + """response/comment"""))
   }
}
        

// @LINE:26
case controllers_RequestResponse_collectionAdd14(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.collectionAdd(), HandlerDef(this, "controllers.RequestResponse", "collectionAdd", Nil,"POST", """""", Routes.prefix + """response/collection/add"""))
   }
}
        

// @LINE:27
case controllers_RequestResponse_collectionRemove15(params) => {
   call { 
        invokeHandler(controllers.RequestResponse.collectionRemove(), HandlerDef(this, "controllers.RequestResponse", "collectionRemove", Nil,"POST", """""", Routes.prefix + """response/collection/remove"""))
   }
}
        

// @LINE:30
case controllers_NewsServer_addTags16(params) => {
   call { 
        invokeHandler(controllers.NewsServer.addTags(), HandlerDef(this, "controllers.NewsServer", "addTags", Nil,"POST", """ newsserver""", Routes.prefix + """news/addtags"""))
   }
}
        

// @LINE:31
case controllers_NewsServer_addNews17(params) => {
   call { 
        invokeHandler(controllers.NewsServer.addNews(), HandlerDef(this, "controllers.NewsServer", "addNews", Nil,"POST", """""", Routes.prefix + """news/addnews"""))
   }
}
        
}

}
     