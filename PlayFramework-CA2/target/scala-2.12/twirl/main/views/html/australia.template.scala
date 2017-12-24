
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

object australia extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <li><a href="/flight">Flights</a></li>
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
        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

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
		<div class="australia">
			<section id="Australia">
				<h3>Australia</h3>
				<img src="/assets/images/sydney.jpg" alt="Sydney"/>
				<h5><b>Holiday in Australia</b></h5>
				<p>Take in the iconic sights, historic architecture, lively shopping and vibrant nightlife beating in Sydney's heart.
				 Then soak up the sunshine and embrance the laid back lifestyle on one of the nearby beaches.
				 <br><br>
				 The perfect holidays in Sydney intersperse fantastic attractions with an enviable list of outdoor pursuits.
				  Head to the harbour area and explore the wold famous Sydney Opera House or try the <a href="https://www.britishairways.com/travel/fx/public/en_gb?eId=111083&productCode=VT-SIC.5657BRIDGECLIMB&productType=Module&saleOption=XO">bridge climb</a> for truly spectacular city views.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="NewZealand">
				<h3>New Zealand</h3>
				<img src="/assets/images/newZealand.jpg" alt="New Zealand"/>
				<h5><b>Holiday in New Zealand</b></h5>
				<p>New Zealand is all about nature in all her pomp and majesty with some truly eye-popping natural attractions.
				<br><br>
				Feel the heat in North Island with hissing geysers, hot springs and volcanoes like White Island and Mount Tarawera.
				In the south, glacial ice has scoured dramatic valleys from the peaks of majestic snow capped Southern Alps all the way to the awesome inspiring sounds of Fiordland National Park.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Fiji">
				<h3>Fiji</h3>
				<img src="/assets/images/fiji.jpg" alt="Fiji"/>
				<h5><b>Holiday in Fiji</b></h5>
				<p>An exotic melting pot of cultures and traditions, home to pristion beaches and lush, tropical hinterland.
				 Resorts and hotels in Fiji vary from family friendly accommodations to luxurious and exclusive resorts 
				 and island hideaways for adults, most with fabulous spas and some with beautiful golf courses.
				 <br><br>
				 The island of Fiji enjoy a typical climate throughout the year with high temperatures and humidity the norm. Fiji has on average around six to eight hours of sunshine a day
				  with fairly consistent temperatures throughout the year.</p>
			</section>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 01:51:44 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/australia.scala.html
                  HASH: 63d9debb47d5b50be9f273341a5c3c206003be3d
                  MATRIX: 1034->0
                  LINES: 33->1
                  -- GENERATED --
              */
          