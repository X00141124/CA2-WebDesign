
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Downloads/WebCA2/conf/routes
// @DATE:Sun Dec 24 02:14:26 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:16
  LoginController_2: controllers.LoginController,
  // @LINE:35
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:16
    LoginController_2: controllers.LoginController,
    // @LINE:35
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """america""", """controllers.HomeController.america"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """asia""", """controllers.HomeController.asia"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """australia""", """controllers.HomeController.australia"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """booking""", """controllers.HomeController.booking"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deals""", """controllers.HomeController.deals"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """essential""", """controllers.HomeController.essential"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """europe""", """controllers.HomeController.europe"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """flight""", """controllers.HomeController.flight"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels""", """controllers.HomeController.hotels"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addflight""", """controllers.HomeController.addFlight"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFlightSubmit""", """controllers.HomeController.addFlightSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delFlight/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteFlight(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_america1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("america")))
  )
  private[this] lazy val controllers_HomeController_america1_invoker = createInvoker(
    HomeController_0.america,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "america",
      Nil,
      "GET",
      this.prefix + """america""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_asia2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("asia")))
  )
  private[this] lazy val controllers_HomeController_asia2_invoker = createInvoker(
    HomeController_0.asia,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "asia",
      Nil,
      "GET",
      this.prefix + """asia""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_australia3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("australia")))
  )
  private[this] lazy val controllers_HomeController_australia3_invoker = createInvoker(
    HomeController_0.australia,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "australia",
      Nil,
      "GET",
      this.prefix + """australia""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_booking4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("booking")))
  )
  private[this] lazy val controllers_HomeController_booking4_invoker = createInvoker(
    HomeController_0.booking,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "booking",
      Nil,
      "GET",
      this.prefix + """booking""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_deals5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deals")))
  )
  private[this] lazy val controllers_HomeController_deals5_invoker = createInvoker(
    HomeController_0.deals,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deals",
      Nil,
      "GET",
      this.prefix + """deals""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_essential6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("essential")))
  )
  private[this] lazy val controllers_HomeController_essential6_invoker = createInvoker(
    HomeController_0.essential,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "essential",
      Nil,
      "GET",
      this.prefix + """essential""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_europe7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("europe")))
  )
  private[this] lazy val controllers_HomeController_europe7_invoker = createInvoker(
    HomeController_0.europe,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "europe",
      Nil,
      "GET",
      this.prefix + """europe""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_flight8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("flight")))
  )
  private[this] lazy val controllers_HomeController_flight8_invoker = createInvoker(
    HomeController_0.flight,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "flight",
      Nil,
      "GET",
      this.prefix + """flight""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_hotels9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels")))
  )
  private[this] lazy val controllers_HomeController_hotels9_invoker = createInvoker(
    HomeController_0.hotels,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "hotels",
      Nil,
      "GET",
      this.prefix + """hotels""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_login10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login10_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_signup11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup11_invoker = createInvoker(
    HomeController_0.signup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addFlight12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addflight")))
  )
  private[this] lazy val controllers_HomeController_addFlight12_invoker = createInvoker(
    HomeController_0.addFlight,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addFlight",
      Nil,
      "GET",
      this.prefix + """addflight""",
      """ Request to load the add flight form""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_addFlightSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFlightSubmit")))
  )
  private[this] lazy val controllers_HomeController_addFlightSubmit13_invoker = createInvoker(
    HomeController_0.addFlightSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addFlightSubmit",
      Nil,
      "POST",
      this.prefix + """addFlightSubmit""",
      """ Data submitted by the from""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_deleteFlight14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delFlight/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteFlight14_invoker = createInvoker(
    HomeController_0.deleteFlight(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteFlight",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delFlight/""" + "$" + """id<[^/]+>""",
      """ Delete a flight by a boarding""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LoginController_login15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login15_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login routes""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LoginController_loginSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit16_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Logout")))
  )
  private[this] lazy val controllers_LoginController_logout17_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """Logout""",
      """ Logout routea""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_america1_route(params@_) =>
      call { 
        controllers_HomeController_america1_invoker.call(HomeController_0.america)
      }
  
    // @LINE:8
    case controllers_HomeController_asia2_route(params@_) =>
      call { 
        controllers_HomeController_asia2_invoker.call(HomeController_0.asia)
      }
  
    // @LINE:9
    case controllers_HomeController_australia3_route(params@_) =>
      call { 
        controllers_HomeController_australia3_invoker.call(HomeController_0.australia)
      }
  
    // @LINE:10
    case controllers_HomeController_booking4_route(params@_) =>
      call { 
        controllers_HomeController_booking4_invoker.call(HomeController_0.booking)
      }
  
    // @LINE:11
    case controllers_HomeController_deals5_route(params@_) =>
      call { 
        controllers_HomeController_deals5_invoker.call(HomeController_0.deals)
      }
  
    // @LINE:12
    case controllers_HomeController_essential6_route(params@_) =>
      call { 
        controllers_HomeController_essential6_invoker.call(HomeController_0.essential)
      }
  
    // @LINE:13
    case controllers_HomeController_europe7_route(params@_) =>
      call { 
        controllers_HomeController_europe7_invoker.call(HomeController_0.europe)
      }
  
    // @LINE:14
    case controllers_HomeController_flight8_route(params@_) =>
      call { 
        controllers_HomeController_flight8_invoker.call(HomeController_0.flight)
      }
  
    // @LINE:15
    case controllers_HomeController_hotels9_route(params@_) =>
      call { 
        controllers_HomeController_hotels9_invoker.call(HomeController_0.hotels)
      }
  
    // @LINE:16
    case controllers_LoginController_login10_route(params@_) =>
      call { 
        controllers_LoginController_login10_invoker.call(LoginController_2.login)
      }
  
    // @LINE:17
    case controllers_HomeController_signup11_route(params@_) =>
      call { 
        controllers_HomeController_signup11_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:20
    case controllers_HomeController_addFlight12_route(params@_) =>
      call { 
        controllers_HomeController_addFlight12_invoker.call(HomeController_0.addFlight)
      }
  
    // @LINE:23
    case controllers_HomeController_addFlightSubmit13_route(params@_) =>
      call { 
        controllers_HomeController_addFlightSubmit13_invoker.call(HomeController_0.addFlightSubmit)
      }
  
    // @LINE:26
    case controllers_HomeController_deleteFlight14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteFlight14_invoker.call(HomeController_0.deleteFlight(id))
      }
  
    // @LINE:29
    case controllers_LoginController_login15_route(params@_) =>
      call { 
        controllers_LoginController_login15_invoker.call(LoginController_2.login)
      }
  
    // @LINE:30
    case controllers_LoginController_loginSubmit16_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit16_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:33
    case controllers_LoginController_logout17_route(params@_) =>
      call { 
        controllers_LoginController_logout17_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:35
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
