// @SOURCE:E:/git/CherryServer/conf/routes
// @HASH:ca80d9db82fcb25c4d130e83dd71b6cc9ff95487
// @DATE:Wed Jul 08 15:00:35 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
class ReverseWebPage {
    

// @LINE:12
def news(newsid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newspage/" + implicitly[PathBindable[Long]].unbind("newsid", newsid))
}
                                                
    
}
                          

// @LINE:31
// @LINE:30
class ReverseNewsServer {
    

// @LINE:31
def addNews(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "news/addnews")
}
                                                

// @LINE:30
def addTags(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "news/addtags")
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseRequestResponse {
    

// @LINE:23
def search(kwd:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/search/" + implicitly[PathBindable[String]].unbind("kwd", dynamicString(kwd)))
}
                                                

// @LINE:26
def collectionAdd(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/collection/add")
}
                                                

// @LINE:20
def usertagUpdate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/usertag/update")
}
                                                

// @LINE:25
def comment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/comment")
}
                                                

// @LINE:18
def getCollection(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/usercollection")
}
                                                

// @LINE:24
def getTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/gettags")
}
                                                

// @LINE:19
def usertagGet(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/usertag/get")
}
                                                

// @LINE:17
def regist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/regist")
}
                                                

// @LINE:27
def collectionRemove(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/collection/remove")
}
                                                

// @LINE:21
def getNewsListByTags(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/getnewsbytags")
}
                                                

// @LINE:22
def getnewslatest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/getnewslatest")
}
                                                

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response")
}
                                                

// @LINE:16
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/login")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
class ReverseWebPage {
    

// @LINE:12
def news : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebPage.news",
   """
      function(newsid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newspage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("newsid", newsid)})
      }
   """
)
                        
    
}
              

// @LINE:31
// @LINE:30
class ReverseNewsServer {
    

// @LINE:31
def addNews : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsServer.addNews",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "news/addnews"})
      }
   """
)
                        

// @LINE:30
def addTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsServer.addTags",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "news/addtags"})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseRequestResponse {
    

// @LINE:23
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.search",
   """
      function(kwd) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("kwd", encodeURIComponent(kwd))})
      }
   """
)
                        

// @LINE:26
def collectionAdd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.collectionAdd",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/collection/add"})
      }
   """
)
                        

// @LINE:20
def usertagUpdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.usertagUpdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/usertag/update"})
      }
   """
)
                        

// @LINE:25
def comment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.comment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/comment"})
      }
   """
)
                        

// @LINE:18
def getCollection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getCollection",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/usercollection"})
      }
   """
)
                        

// @LINE:24
def getTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/gettags"})
      }
   """
)
                        

// @LINE:19
def usertagGet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.usertagGet",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/usertag/get"})
      }
   """
)
                        

// @LINE:17
def regist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.regist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/regist"})
      }
   """
)
                        

// @LINE:27
def collectionRemove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.collectionRemove",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/collection/remove"})
      }
   """
)
                        

// @LINE:21
def getNewsListByTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getNewsListByTags",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/getnewsbytags"})
      }
   """
)
                        

// @LINE:22
def getnewslatest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getnewslatest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/getnewslatest"})
      }
   """
)
                        

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response"})
      }
   """
)
                        

// @LINE:16
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/login"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
class ReverseWebPage {
    

// @LINE:12
def news(newsid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebPage.news(newsid), HandlerDef(this, "controllers.WebPage", "news", Seq(classOf[Long]), "GET", """ newspage""", _prefix + """newspage/$newsid<[^/]+>""")
)
                      
    
}
                          

// @LINE:31
// @LINE:30
class ReverseNewsServer {
    

// @LINE:31
def addNews(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsServer.addNews(), HandlerDef(this, "controllers.NewsServer", "addNews", Seq(), "POST", """""", _prefix + """news/addnews""")
)
                      

// @LINE:30
def addTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsServer.addTags(), HandlerDef(this, "controllers.NewsServer", "addTags", Seq(), "POST", """ newsserver""", _prefix + """news/addtags""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseRequestResponse {
    

// @LINE:23
def search(kwd:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.search(kwd), HandlerDef(this, "controllers.RequestResponse", "search", Seq(classOf[String]), "GET", """""", _prefix + """response/search/$kwd<[^/]+>""")
)
                      

// @LINE:26
def collectionAdd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.collectionAdd(), HandlerDef(this, "controllers.RequestResponse", "collectionAdd", Seq(), "POST", """""", _prefix + """response/collection/add""")
)
                      

// @LINE:20
def usertagUpdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.usertagUpdate(), HandlerDef(this, "controllers.RequestResponse", "usertagUpdate", Seq(), "POST", """""", _prefix + """response/usertag/update""")
)
                      

// @LINE:25
def comment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.comment(), HandlerDef(this, "controllers.RequestResponse", "comment", Seq(), "POST", """""", _prefix + """response/comment""")
)
                      

// @LINE:18
def getCollection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getCollection(), HandlerDef(this, "controllers.RequestResponse", "getCollection", Seq(), "POST", """""", _prefix + """response/usercollection""")
)
                      

// @LINE:24
def getTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getTags(), HandlerDef(this, "controllers.RequestResponse", "getTags", Seq(), "GET", """""", _prefix + """response/gettags""")
)
                      

// @LINE:19
def usertagGet(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.usertagGet(), HandlerDef(this, "controllers.RequestResponse", "usertagGet", Seq(), "POST", """""", _prefix + """response/usertag/get""")
)
                      

// @LINE:17
def regist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.regist(), HandlerDef(this, "controllers.RequestResponse", "regist", Seq(), "POST", """""", _prefix + """response/regist""")
)
                      

// @LINE:27
def collectionRemove(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.collectionRemove(), HandlerDef(this, "controllers.RequestResponse", "collectionRemove", Seq(), "POST", """""", _prefix + """response/collection/remove""")
)
                      

// @LINE:21
def getNewsListByTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getNewsListByTags(), HandlerDef(this, "controllers.RequestResponse", "getNewsListByTags", Seq(), "POST", """""", _prefix + """response/getnewsbytags""")
)
                      

// @LINE:22
def getnewslatest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getnewslatest(), HandlerDef(this, "controllers.RequestResponse", "getnewslatest", Seq(), "GET", """""", _prefix + """response/getnewslatest""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.index(), HandlerDef(this, "controllers.RequestResponse", "index", Seq(), "GET", """ requestrespnse""", _prefix + """response""")
)
                      

// @LINE:16
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.login(), HandlerDef(this, "controllers.RequestResponse", "login", Seq(), "POST", """""", _prefix + """response/login""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    