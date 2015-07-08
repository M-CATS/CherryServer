// @SOURCE:E:/git/CherryServer/conf/routes
// @HASH:c0a23eb30ad64481d6380fd46fd0c146a9de2508
// @DATE:Tue Jun 30 12:32:35 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


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
    

// @LINE:21
def userTagsUpdate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/usertagupdate")
}
                                                

// @LINE:20
def search(kws:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/search/kwd" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("kws", kws)))))
}
                                                

// @LINE:23
def collectionAdd(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/collection/add")
}
                                                

// @LINE:22
def comment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/comment")
}
                                                

// @LINE:17
def regist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/regist")
}
                                                

// @LINE:24
def collectionRemove(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "response/collection/remove")
}
                                                

// @LINE:19
def getnewslatest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/getnewslatest")
}
                                                

// @LINE:18
def getNewsListByTags(tags:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "response/getnewsbytags/tags" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("tags", tags)))))
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
                          

// @LINE:12
class ReverseWebPage {
    

// @LINE:12
def news(newsid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newspage/" + implicitly[PathBindable[Long]].unbind("newsid", newsid))
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
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
    

// @LINE:21
def userTagsUpdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.userTagsUpdate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/usertagupdate"})
      }
   """
)
                        

// @LINE:20
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.search",
   """
      function(kws) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/search/kwd" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("kws", kws)])})
      }
   """
)
                        

// @LINE:23
def collectionAdd : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.collectionAdd",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/collection/add"})
      }
   """
)
                        

// @LINE:22
def comment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.comment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/comment"})
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
                        

// @LINE:24
def collectionRemove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.collectionRemove",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "response/collection/remove"})
      }
   """
)
                        

// @LINE:19
def getnewslatest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getnewslatest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/getnewslatest"})
      }
   """
)
                        

// @LINE:18
def getNewsListByTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RequestResponse.getNewsListByTags",
   """
      function(tags) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "response/getnewsbytags/tags" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("tags", tags)])})
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
    

// @LINE:21
def userTagsUpdate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.userTagsUpdate(), HandlerDef(this, "controllers.RequestResponse", "userTagsUpdate", Seq(), "POST", """""", _prefix + """response/usertagupdate""")
)
                      

// @LINE:20
def search(kws:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.search(kws), HandlerDef(this, "controllers.RequestResponse", "search", Seq(classOf[String]), "GET", """""", _prefix + """response/search/kwd""")
)
                      

// @LINE:23
def collectionAdd(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.collectionAdd(), HandlerDef(this, "controllers.RequestResponse", "collectionAdd", Seq(), "POST", """""", _prefix + """response/collection/add""")
)
                      

// @LINE:22
def comment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.comment(), HandlerDef(this, "controllers.RequestResponse", "comment", Seq(), "POST", """""", _prefix + """response/comment""")
)
                      

// @LINE:17
def regist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.regist(), HandlerDef(this, "controllers.RequestResponse", "regist", Seq(), "POST", """""", _prefix + """response/regist""")
)
                      

// @LINE:24
def collectionRemove(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.collectionRemove(), HandlerDef(this, "controllers.RequestResponse", "collectionRemove", Seq(), "POST", """""", _prefix + """response/collection/remove""")
)
                      

// @LINE:19
def getnewslatest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getnewslatest(), HandlerDef(this, "controllers.RequestResponse", "getnewslatest", Seq(), "GET", """""", _prefix + """response/getnewslatest""")
)
                      

// @LINE:18
def getNewsListByTags(tags:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RequestResponse.getNewsListByTags(tags), HandlerDef(this, "controllers.RequestResponse", "getNewsListByTags", Seq(classOf[String]), "GET", """""", _prefix + """response/getnewsbytags/tags""")
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
                          

// @LINE:12
class ReverseWebPage {
    

// @LINE:12
def news(newsid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebPage.news(newsid), HandlerDef(this, "controllers.WebPage", "news", Seq(classOf[Long]), "GET", """ newspage""", _prefix + """newspage/$newsid<[^/]+>""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
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
        
    