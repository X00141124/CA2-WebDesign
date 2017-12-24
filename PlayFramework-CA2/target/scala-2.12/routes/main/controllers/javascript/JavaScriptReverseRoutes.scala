
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Downloads/WebCA2/conf/routes
// @DATE:Sun Dec 24 02:14:26 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def hotels: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hotels",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hotels"})
        }
      """
    )
  
    // @LINE:23
    def addFlightSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addFlightSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addFlightSubmit"})
        }
      """
    )
  
    // @LINE:7
    def america: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.america",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "america"})
        }
      """
    )
  
    // @LINE:8
    def asia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.asia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asia"})
        }
      """
    )
  
    // @LINE:13
    def europe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.europe",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "europe"})
        }
      """
    )
  
    // @LINE:17
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:12
    def essential: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.essential",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "essential"})
        }
      """
    )
  
    // @LINE:9
    def australia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.australia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "australia"})
        }
      """
    )
  
    // @LINE:20
    def addFlight: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addFlight",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addflight"})
        }
      """
    )
  
    // @LINE:10
    def booking: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.booking",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "booking"})
        }
      """
    )
  
    // @LINE:14
    def flight: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.flight",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "flight"})
        }
      """
    )
  
    // @LINE:11
    def deals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deals"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:26
    def deleteFlight: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFlight",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delFlight/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:33
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Logout"})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
