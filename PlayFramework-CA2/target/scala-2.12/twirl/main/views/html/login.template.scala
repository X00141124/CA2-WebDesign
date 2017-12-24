
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>

  <head>
	  <meta charset="utf-8">
	  <link rel="stylesheet" href="/assets/stylesheets/font-awesome.min.css">
	  <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
	     
	  <link rel="stylesheet" href="/assets/stylesheets/style.css" type="text/css" media="screen">
  </head>

  <body>

	<script src="/assets/javascripts/script.js"></script>
	<script src="/assets/javascripts/jquery.min.js"></script>
	<script src="/assets/bootstrap/js/bootstrap.min.js"></script> 
	<script src="/assets/javascripts/jquery-1.10.1.min.js"></script>
		
		<header>
		  <div class="banner">
		   <a href="/"><img src="/assets/images/banner4.jpg" alt="Banner"></a>	
		  </div>
		</header>

    <nav class="navbar navbar-static-top">
	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>

      <ul class="nav navbar-nav">
		<li class="active"><a href="/">Home</a></li>
        <li><a href="/hotels">Hotels</a></li>
        <li><a href="/flight">Flights</a></li>
        <li><a href="/essential">Essentials</a></li>
      </ul>

      
       <ul class="nav navbar-nav">
		
          
            <li>
			<a class="dropdown-hover" data-toggle="dropdown">Destinations<span class="caret"></span></a>
                
				<ul id="dropdown" class="dropdown-menu">
				
                  <li class="dropdown-header">Africa</li>
                  <li><a href="/africa.#Egypt">Egypt</a></li>
                  <li><a href="/africa.#Kenya">Kenya</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">America</li>
                  <li><a href="/america#NewYork">New York City</a></li>
                  <li><a href="/america#LasVegas">Las Vegas</a></li>
                  <li><a href="/america#Canada">Canada</a></li>
                  <li><a href="/america#Brazil">Brazil</a></li>
                  <li><a href="/america#Argentina">Argentina</a></li>
                
				

                
                  <li class="dropdown-header">Asia</li>
                  <li><a href="/asia#Thailand">Thailand</a></li>
                  <li><a href="/asia#Japan">Japan</a></li>
                  <li><a href="/asia#UAE">United Arab Emirates</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Australia</li>
                  <li><a href="/australia#Australia">Australia</a></li>
                  <li><a href="/australia#NewZealand">New Zealand</a></li>
                  <li><a href="/australia#Fiji">Fiji</a></li>
                
			 
                
                  <li class="dropdown-header">Europe</li>
                  <li><a href="/europe#Ireland">Ireland</a></li>
                  <li><a href="/europe#France">France</a></li>
                  <li><a href="/europe#UK">United Kingdom</a></li>
                  <li><a href="/europe#Spain">Spain</a></li>
                  <li><a href="/europe#Poland">Poland</a></li>
				  
                </ul>
              
            
			</li>
		  
        </ul>

      <!-- /.nav-collapse -->

      <ul class="nav navbar-nav">
        <li><a href="/deals">Deals</a></li>
        
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li class="active">
					"""),_display_(/*102.7*/if(user != null)/*102.23*/ {_display_(Seq[Any](format.raw/*102.25*/("""
						"""),format.raw/*103.7*/("""<a href=""""),_display_(/*103.17*/routes/*103.23*/.LoginController.logout()),format.raw/*103.48*/(""""><span class="glyphicon glyphicon-log-in"></span>Logout</a>
					""")))}/*104.8*/else/*104.13*/{_display_(Seq[Any](format.raw/*104.14*/("""
						"""),format.raw/*105.7*/("""<a href=""""),_display_(/*105.17*/routes/*105.23*/.LoginController.login()),format.raw/*105.47*/("""">Login</a>
					""")))}),format.raw/*106.7*/("""
					"""),format.raw/*107.6*/("""</li>
			<form class="navbar-form navbar-left">
			  <div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			  </div>
			  <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
			</form>

      </ul>
    </nav>
			<div class="clear">
			</div>
					
	<main>
	
	</main>
	
			<div class="clear">
			</div>


<div class="container">
			<h1 class="well">Sign in</h1>
			
			"""),_display_(/*131.5*/if(loginForm.hasGlobalErrors)/*131.34*/ {_display_(Seq[Any](format.raw/*131.36*/("""
				"""),format.raw/*132.5*/("""<p class="alert alert-warning">
					"""),_display_(/*133.7*/loginForm/*133.16*/.globalError.message),format.raw/*133.36*/("""
				"""),format.raw/*134.5*/("""</p>
			""")))}),format.raw/*135.5*/("""

			"""),_display_(/*137.5*/if(flash.containsKey("error"))/*137.35*/ {_display_(Seq[Any](format.raw/*137.37*/("""
				"""),format.raw/*138.5*/("""<p class="alert alert-warning">
					"""),_display_(/*139.7*/flash/*139.12*/.get("loginRequired")),format.raw/*139.33*/("""
				"""),format.raw/*140.5*/("""</p>
			""")))}),format.raw/*141.5*/("""
			"""),format.raw/*142.4*/("""<!-- The login form -->
			"""),_display_(/*143.5*/helper/*143.11*/.form(action = controllers.routes.LoginController.loginSubmit())/*143.75*/ {_display_(Seq[Any](format.raw/*143.77*/("""
				"""),format.raw/*144.33*/("""
				"""),_display_(/*145.6*/CSRF/*145.10*/.formField),format.raw/*145.20*/("""

		"""),format.raw/*147.3*/("""<div class="col-lg-12 well">
				<div id="login" class="row">
					<div class="col-sm-6 form-group">
						"""),_display_(/*150.8*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*150.112*/("""
						"""),format.raw/*151.7*/("""<label>Email address</label>
						<input type="email" placeholder="Email" class="form-control">
					</div>
					<div class="col-sm-6 form-group">
							"""),_display_(/*155.9*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*155.123*/("""
						"""),format.raw/*156.7*/("""<label>Password</label>
						<input type="password" placeholder="Password" class="form-control">
					</div>					
				</div>
				<div class="row">				
				  <div class="col-sm-12 text-center">
					<button type="button" class="btn btn-block btn-info">Sign In</button> 
				  </div>
				</div>				  
				<div class="or-text">
					<div class="or-text-row">
						<div class="or-text-line">
							<button type="button" class="btn btn-default btn-circle">or</button>
						</div>
					</div>
				</div>
				<div class="row">	
					<div class="col-sm-4">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">Sign in with Facebook</button>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="btn-group">
							<button type="button" class="btn btn-danger">Sign in with Google+</button>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="btn-group">
							<button type="button" class="btn btn-info">Sign in with Linkedin</button>
						</div>
					</div>
				</div>	
		</div>
	""")))}),format.raw/*190.3*/("""
	"""),format.raw/*191.2*/("""</div>
	
	  </body>

</html>"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 02:14:00 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/login.scala.html
                  HASH: 4f71e58cdd59f1746d7e9a36df9853630d787edf
                  MATRIX: 984->1|1119->85|1164->63|1192->65|1237->102|1265->104|4888->3700|4914->3716|4955->3718|4991->3726|5029->3736|5045->3742|5092->3767|5179->3836|5193->3841|5233->3842|5269->3850|5307->3860|5323->3866|5369->3890|5419->3909|5454->3916|5959->4394|5998->4423|6039->4425|6073->4431|6139->4470|6158->4479|6200->4499|6234->4505|6275->4515|6310->4523|6350->4553|6391->4555|6425->4561|6491->4600|6506->4605|6549->4626|6583->4632|6624->4642|6657->4647|6713->4676|6729->4682|6803->4746|6844->4748|6879->4782|6913->4789|6927->4793|6959->4803|6993->4809|7131->4920|7258->5024|7294->5032|7481->5192|7618->5306|7654->5314|8763->6392|8794->6395
                  LINES: 28->1|31->4|34->1|35->2|37->5|38->6|134->102|134->102|134->102|135->103|135->103|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|137->105|138->106|139->107|163->131|163->131|163->131|164->132|165->133|165->133|165->133|166->134|167->135|169->137|169->137|169->137|170->138|171->139|171->139|171->139|172->140|173->141|174->142|175->143|175->143|175->143|175->143|176->144|177->145|177->145|177->145|179->147|182->150|182->150|183->151|187->155|187->155|188->156|222->190|223->191
                  -- GENERATED --
              */
          