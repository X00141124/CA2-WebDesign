
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

object flight extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Flight],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(flights: List[models.Flight], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>

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

	<script src=""""),_display_(/*21.16*/routes/*21.22*/.Assets.versioned("javascripts/main.js")),format.raw/*21.62*/(""""></script>
		

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
		<li><a href="/">Home</a></li>
        <li><a href="/hotels">Hotels</a></li>
        <li class="active"><a href="/flight">Flights</a></li>
        <li><a href="/essential">Essentials</a></li>
      </ul>

      
        <ul class="nav navbar-nav">
		
          
            <li>
			<a class="dropdown-hover" data-toggle="dropdown">Destinations<span class="caret"></span></a>
                
				<ul id="dropdown" class="dropdown-menu">
				
                  <li class="dropdown-header">Africa</li>
                  <li><a href="/africa#Egypt">Egypt</a></li>
                  <li><a href="/africa#Kenya">Kenya</a></li>
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
						<a href=""""),_display_(/*102.17*/routes/*102.23*/.LoginController.login()),format.raw/*102.47*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

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

		
			<p class="lead">Flight schedule</p>

			"""),format.raw/*121.67*/("""
			"""),_display_(/*122.5*/if(flash.containsKey("success"))/*122.37*/ {_display_(Seq[Any](format.raw/*122.39*/("""
				"""),format.raw/*123.5*/("""<div class="alert alert-success">
					"""),_display_(/*124.7*/flash/*124.12*/.get("success")),format.raw/*124.27*/("""
				"""),format.raw/*125.5*/("""</div>
			""")))}),format.raw/*126.5*/("""
		

		
		"""),format.raw/*130.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
				<!-- The header row-->
				<tr>
					<th>Boarding</th>
					<th>Destination</th>
					<th>Date</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<!-- Flight rows-->
				"""),_display_(/*142.6*/for(f<-flights) yield /*142.21*/ {_display_(Seq[Any](format.raw/*142.23*/("""
				"""),format.raw/*143.5*/("""<tr>
					<td>"""),_display_(/*144.11*/f/*144.12*/.getBoarding),format.raw/*144.24*/("""</td>
					<td>"""),_display_(/*145.11*/f/*145.12*/.getArrival),format.raw/*145.23*/("""</td>
					<td>"""),_display_(/*146.11*/f/*146.12*/.getDate),format.raw/*146.20*/("""</td>
					<td class="numeric">&euro; """),_display_(/*147.34*/("%.2f".format(f.getPrice))),format.raw/*147.61*/("""</td>

					<!-- Delete flight button -->
					<td>
						<a href=""""),_display_(/*151.17*/routes/*151.23*/.HomeController.deleteFlight(f.getId)),format.raw/*151.60*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
				</tr>
			""")))}),format.raw/*156.5*/("""
			"""),format.raw/*157.4*/("""</tbody>
		</table>

		<p>
			<a href=""""),_display_(/*161.14*/routes/*161.20*/.HomeController.addFlight()),format.raw/*161.47*/("""">
				<button class="btn btn-primary">Add a flight</button>
			</a>
		</p>

		<div class="imageFlights">
		<div class="col-sm-6 col-md-2">
		<img src="/assets/images/airlineOffers.jpg" alt="lairline offers" width="500" height="300" align="left" >
		</div>
		</div>
		
		<div class="imageFlights">
		<div class="col-sm-6 col-md-2">
		<img src="/assets/images/dublinFlights.jpg" alt="dublin flights" width="500" height="300" align="left" >
		</div>
		</div>
		
		<div class="imageFlights">
		<div class="col-sm-6 col-md-2">
		<img src="/assets/images/EmiratesFlights.jpg" alt="emirates flights" width="500" height="300" align="left" >
		</div>
		</div>
		
		
	</main>
	
			<div class="clear">
			</div>

	<footer>
	
		<div class="container">
		  <h2>Contact Us</h2>
		  <p>Feel free to contact  us by filling the contact form or visiting our social network sites like Facebook, Youtube, Twitter.</p>
		  
		  <form class="form-horizontal">
			<div class="form-group">
			  <label for="name">Name:</label>
			  <input type="name" class="form-control" id="name" placeholder="Enter your full name">
			</div>
			<div class="form-group">
			  <label for="email">Email address:</label>
			  <input type="email" class="form-control" id="email" placeholder="Enter email">
			</div>
			<div class="form-group">
			  <label for="message">Message:</label>

			  <textarea  class="form-control" placeholder="Enter message"></textarea>
			</div>
			<div class="text-right">
			<button type="submit" class="btn btn-default">Send</button>
			</div>
		  </form>
		  
		 <hr>
              <h4>Our Social Sites</h4>
				<a href="https://www.facebook.com/" class="fa fa-facebook"></a>
				<a href="https://twitter.com/" class="fa fa-twitter"></a>
				<a href="https://plus.google.com/" class="fa fa-google"></a>
				<a href="https://www.youtube.com/" class="fa fa-youtube"></a>
				<hr>
				<h4>Our Address</h4>
				<p>Tallaght Dublin 24, Ireland</p>
				<h4>Phone</h4>
				<p>(01) 123 436</p>
				<h4>Email</h4>
				<p>sunshinetravel@gmail.com</p>
		<hr>
			<div class="payment">
			<img src="/assets/images/payment.jpg" alt="Payment" width="470" height="30" align="middle">
			</div>
		
		</div>
	<div class="copyright">
	<span>&copy; 2017 Sunshine Travel. All Rights Reserved.</span></div>
	</footer>

  </body>

</html>
"""))
      }
    }
  }

  def render(flights:List[models.Flight],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(flights,user)

  def f:((List[models.Flight],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (flights,user) => apply(flights,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 02:08:51 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/flight.scala.html
                  HASH: 2765c6e6902885788c00853988c8bed2c0668109
                  MATRIX: 980->1|1130->56|1158->58|1796->669|1811->675|1872->715|4946->3761|4962->3767|5008->3791|5505->4322|5538->4328|5580->4360|5621->4362|5655->4368|5723->4409|5738->4414|5775->4429|5809->4435|5852->4447|5894->4461|6195->4735|6227->4750|6268->4752|6302->4758|6346->4774|6357->4775|6391->4787|6436->4804|6447->4805|6480->4816|6525->4833|6536->4834|6566->4842|6634->4882|6683->4909|6783->4981|6799->4987|6858->5024|7045->5180|7078->5185|7150->5229|7166->5235|7215->5262
                  LINES: 28->1|33->1|34->2|53->21|53->21|53->21|134->102|134->102|134->102|153->121|154->122|154->122|154->122|155->123|156->124|156->124|156->124|157->125|158->126|162->130|174->142|174->142|174->142|175->143|176->144|176->144|176->144|177->145|177->145|177->145|178->146|178->146|178->146|179->147|179->147|183->151|183->151|183->151|188->156|189->157|193->161|193->161|193->161
                  -- GENERATED --
              */
          