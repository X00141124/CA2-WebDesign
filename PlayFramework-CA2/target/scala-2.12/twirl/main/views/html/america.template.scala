
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

object america extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
		<div class="america">
			<section id="NewYork">
				<h3>New York</h3>
				<img src="/assets/images/newYork.jpg" alt="New York"/>
				<h5><b>Holiday in New York</b></h5>
				<p>New York, the most famous city in the world, is an exciting mix of trendy neighbourhoods, fashionable districts and iconic locations.
				Each area has its own individual character and attractions.<br><br>
				Midtown is home to many of the iconic sights of the Big Apple and regardless of whether you stay here or not, you’re likely to be spending a lot of your time here. 
				<br>Home to the neon lights of Times Square you can catch one of Broadway’s dazzling shows, 
				shop til you drop at legendary Macy’s or the many stores on 5th Avenue or Cheer on the Knicks at Madison Square Garden. <br><br>
				Downtown New York & Brooklyn cleverly toe the line between business and pleasure and boast a variety of neighbourhoods all easily connected to the Big Apple’s key attractions by the subway or a taxi. </p>
				
			</section>
			
			<div class="clear">
			</div>
			
			<section id="LasVegas">
				<h3>Las Vegas</h3>
				<img src="/assets/images/lasvegas.jpg" alt="Las Vegas"/>
				<h5><b>Holiday in Las Vegas</b></h5>
				<p>Dazzling like a diamond in the desert, LAS VEGAS is fabulous, fun and full of excitement. Some of the world’s most opulent and distinctive hotels are focused around the legendary Las Vegas Strip, 
				where visitors can stroll past the New York skyline, the Eiffel Tower and along a Venetian canal. Beyond the famous casinos are fun-packed options to suit all holiday tastes. 
				Take a helicopter trip to the Grand Canyon, visit the awesome Hoover Dam or catch a spectacular Cirque du Soleil show. Las Vegas is also your jumping-off point for many of the national parks in neighbouring California, Utah and Arizona.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Canada">
				<h3>Canada</h3>
				<img src="/assets/images/canada.jpg" alt="Canada"/>
				<h5><b>Holiday in Canada</b></h5>
				<p>A huge country, stretching all the way from the Pacific in the west to the Atlantic in the east. There's skiing at Whistler, culture and history in the cities of Quebec and Montreal, 
				entertainment and shopping in Vancouver and Toronto, 
				plus some of the most fantastic scenery you will ever see, including the Rocky Mountains and Niagara Falls.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Brazil">
				<h3>Brazil</h3>
				<img src="/assets/images/brazil.jpg" alt="Brazil"/>
				<h5><b>Holiday in Brazil</b></h5>
				<p>For scale, spectacle and sheer exuberance, few countries can hold a candle to Brazil. With magnifcent natural spectacles, vibrant cities and glorios beaches A holiday to Brazil is unbeatable.
				<br><br> Rio de Janeiro boasts world famous beaches, the epic carnival in February and iconic views. 
				<br>It calls itself the ‘Cidade Maravilhosa’ (Marvellous City) and it’s hard not to agree.<br><br>
				The Amazon basin spreads out over nine countries and has the most diverse and delicate ecosystem on the planet.</p>
			</section>
			
			<div class="clear">
			</div>
			
			
			<section id="Argentina">
				<h3>Argentina</h3>
				<img src="/assets/images/ag.jpg" alt="Argentina"/>
				<h5><b>Holiday in Argentina</b></h5>
				<p>Vibrant colourful and incredibly diverse Argentina bursts with life from the colourful streets of vibrant Buenos Aires to the remote wilderness of Patagonia.
				Beaches, waterfalls mountains, glaciers and mighty waterfalls – Argentina has the lot.<br><br>
				Argentina’s vibrant capital Buenos Aires is a sophisticated introduction to the country boasting a thriving café culture, fine dining, & sophisticated nightlife.
				</p>
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
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/america.scala.html
                  HASH: 19483078ba9b1aa9695843d00cc8b89b06241de3
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          