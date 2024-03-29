
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

object asia extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
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
		
		<header>
		  <div class="banner">
		   <a href="index.html"><img src="/assets/images/banner4.jpg" alt="Banner"></a>	
		  </div>
		</header>

    <nav class="navbar navbar-static-top">
	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>

      <ul class="nav navbar-nav">
		<li><a href="index.html">Home</a></li>
        <li><a href="hotels.html">Hotels</a></li>
        <li><a href="flight.html">Flights</a></li>
        <li><a href="essential.html">Essentials</a></li>
      </ul>

      
        <ul class="nav navbar-nav">
		
          
            <li>
			<a class="dropdown-hover" data-toggle="dropdown">Destinations<span class="caret"></span></a>
                
				<ul id="dropdown" class="dropdown-menu">
				
                  <li class="dropdown-header">Africa</li>
                  <li><a href="africa.html#Egypt">Egypt</a></li>
                  <li><a href="africa.html#Kenya">Kenya</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">America</li>
                  <li><a href="america.html#NewYork">New York City</a></li>
                  <li><a href="america.html#LasVegas">Las Vegas</a></li>
                  <li><a href="america.html#Canada">Canada</a></li>
                  <li><a href="america.html#Brazil">Brazil</a></li>
                  <li><a href="america.html#Argentina">Argentina</a></li>
                
				

                
                  <li class="dropdown-header">Asia</li>
                  <li><a href="asia.html#Thailand">Thailand</a></li>
                  <li><a href="asia.html#Japan">Japan</a></li>
                  <li><a href="asia.html#UAE">United Arab Emirates</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Australia</li>
                  <li><a href="australia.html#Australia">Australia</a></li>
                  <li><a href="australia.html#NewZealand">New Zealand</a></li>
                  <li><a href="australia.html#Fiji">Fiji</a></li>
                
			 
                
                  <li class="dropdown-header">Europe</li>
                  <li><a href="europe.html#Ireland">Ireland</a></li>
                  <li><a href="europe.html#France">France</a></li>
                  <li><a href="europe.html#UK">United Kingdom</a></li>
                  <li><a href="europe.html#Spain">Spain</a></li>
                  <li><a href="europe.html#Poland">Poland</a></li>
				  
                </ul>
              
            
			</li>
		  
        </ul>

      <!-- /.nav-collapse -->

      <ul class="nav navbar-nav">
        <li><a href="deals.html">Deals</a></li>
        
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="signup.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

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
		<div class="asia">
			
			<div class="clear">
			</div>
			
			<section id="Thailand">
				<h3>Thailand</h3>
				<img src="images/thailand.jpg" alt="Thailand"/>
				<h5><b>Holiday in Thailand</b></h5>
				<p>With sixteen million foreigners flying into the country each year, Thailand is Asia’s primary travel destination and offers a host of places to visit. 
				Yet despite this vast influx of visitors, Thailand’s cultural integrity remains largely undamaged – a country that adroitly avoided colonization has been able to absorb Western influences while maintaining its own rich heritage. 
				Though the high-rises and neon lights occupy the foreground of the tourist picture, the typical Thai community is still the farming village, and you need not venture far to encounter a more traditional scene of fishing communities, 
				rubber plantations and Buddhist temples. Around forty percent of Thais earn their living from the land, based around the staple rice,
				which forms the foundation of the country’s unique and famously sophisticated cuisine.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Japan">
				<h3>Japan</h3>
				<img src="images/japan.jpg" alt="Japan"/>
				<h5><b>Holiday in Japan</b></h5>
				<p>A huge percentage of Japan's land mass is made up of mountains, meaning this country is any snow sport, climber or hiker's dream. Japan is also home to a wide variety of climates - from the sub tropical beaches of Okinawa, 
				to the snow-covered mountains of Hokkaido, meaning it suits all types of holidaymakers. Plenty of volcanic natural wonders and hot springs to explore mean getting out and about in Japan's countryside is the best way to make the most of your time in the country.<br><br>
				Whether you hike, ski, run, cycle, or just like the thought of sitting back in a natural hot spring with nothing but mountains all around you, 
				see our suggestions for the best places to cosy up with nature in Japan.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="UAE">
				<h3>United Arab Emirates</h3>
				<img src="images/uae.jpg" alt="UAE"/>
				<h5><b>Holiday in United Arab Emirates</b></h5>
				<p>For most people, the United Arab Emirates means just one place: Dubai, the sci-fi-esque city of iconic skyscrapers, palm-shaped islands, city-sized malls, indoor ski slopes and palatial beach resorts. 
				But beyond the glitter awaits a diverse mosaic of six more emirates, each with its own character and allure.<br><br>
				North of Dubai, Sharjah does art and heritage best, while tiny Ajman and Umm Al Quwain provide glimpses of life in the pre-oil days, and Ras Al Khaimah snuggles against the mighty Hajar Mountains. For the best swimming and diving, though, 
				head across the range to Fujairah to frolic in the clear waters of the Gulf of Oman.</p>
			</section>
			
			<div class="clear">
			</div>
			
		</div>
	
		
	</main>
	
			<div class="clear">
			</div>

	<footer>
	
		<div class="container">
		  <h3>Contact Us</h3>
		  <p>Feel free to contact us by filling the contact form or visiting our social network sites like Facebook, Youtube, Twitter.</p>
		  
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
			<img src="images/payment.jpg" alt="Payment" width="470" height="30" align="middle">
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 01:51:44 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/asia.scala.html
                  HASH: 5cb2729814e87e9f83647e67686891b7ef804b41
                  MATRIX: 1029->0
                  LINES: 33->1
                  -- GENERATED --
              */
          