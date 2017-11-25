
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Yanika-Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Fri Nov 24 21:55:51 GMT 2017

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
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
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
  private[this] lazy val controllers_HomeController_login10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login10_invoker = createInvoker(
    HomeController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
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
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
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
    case controllers_HomeController_login10_route(params@_) =>
      call { 
        controllers_HomeController_login10_invoker.call(HomeController_0.login)
      }
  
    // @LINE:17
    case controllers_HomeController_signup11_route(params@_) =>
      call { 
        controllers_HomeController_signup11_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:20
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
