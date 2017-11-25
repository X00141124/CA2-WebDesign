
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

object booking extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                  <li><a href="/africa.html#Egypt">Egypt</a></li>
                  <li><a href="/africa.html#Kenya">Kenya</a></li>
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
	
	<div id="Form" class="container">
		<form method="post" action="//submit.form" onSubmit="return validateForm();">
		<div style="width: 400px;">
		</div>
		<div style="padding-bottom: 18px;font-size : 21px;">Hotel Reservation</div>
		<div style="display: flex; padding-bottom: 18px;width : 450px;">
		

		<div style=" margin-left : 0; margin-right : 1%; width : 49%;">First name<span style="color: red;"> *</span><br/>
		<input type="text" id="data_2" name="data_2" style="width: 100%;" class="form-control"/>
		</div>
		<div style=" margin-left : 1%; margin-right : 0; width : 49%;">Last name<span style="color: red;"> *</span><br/>
		<input type="text" id="data_3" name="data_3" style="width: 100%;" class="form-control"/>
		</div>
		</div><div style="padding-bottom: 18px;">Phone<span style="color: red;"> *</span><br/>
		<input type="text" id="data_4" name="data_4" style="width : 450px;" class="form-control"/>
		</div>
		<div style="padding-bottom: 18px;">Email<span style="color: red;"> *</span><br/>
		<input type="text" id="data_5" name="data_5" style="width : 450px;" class="form-control"/>
		</div>
		<div style="padding-bottom: 18px;">Arrival date<span style="color: red;"> *</span><br/>
		<input type="text" id="data_6" name="data_6" style="width : 250px;" class="form-control"/>
		</div>
		<script src="/assets/javascripts/js/pikaday.min.js" type="text/javascript"></script>
		<link href="/assets/stylesheets/css/pikaday.min.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript">new Pikaday("""),format.raw/*138.46*/("""{"""),format.raw/*138.47*/(""" """),format.raw/*138.48*/("""field: document.getElementById('data_6') """),format.raw/*138.89*/("""}"""),format.raw/*138.90*/(""");</script>
		<div style="padding-bottom: 18px;">Departure date<span style="color: red;"> *</span><br/>
		<input type="text" id="data_7" name="data_7" style="width : 250px;" class="form-control"/>
		</div>
		<script src="/assets/javascripts/js/pikaday.min.js" type="text/javascript"></script>
		<link href="/assets/stylesheets/css/pikaday.min.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript">new Pikaday("""),format.raw/*144.46*/("""{"""),format.raw/*144.47*/(""" """),format.raw/*144.48*/("""field: document.getElementById('data_7') """),format.raw/*144.89*/("""}"""),format.raw/*144.90*/(""");</script>
		<div style="padding-bottom: 18px;">Number of adults<span style="color: red;"> *</span><br/>
		<input type="number" id="data_8" name="data_8" style="width : 250px;" class="form-control"/>
		</div>
		<div style="padding-bottom: 18px;">Number of children<br/>
		<input type="number" id="data_9" name="data_9" style="width : 250px;" class="form-control"/>
		</div>
		<div style="padding-bottom: 18px;">Questions/Comments<br/>
		<textarea id="data_10" false name="data_10" style="width : 450px;" rows="6" class="form-control"></textarea>
		</div>
		<div style="padding-bottom: 18px;"><input name="skip_Submit" value="Submit" type="submit"/></div>
		<!--<div>
		<div style="float:right"><a href="https://www.100forms.com" id="lnk100" title="form to email">...</a></div>
		<script src="https://www.100forms.com/js/FORMKEY:6YNBXRM4J2GW/SEND:my@email.com" type="text/javascript"></script>
		</div>-->
		</form>
	</div>
	</main>
	
			<div class="clear">
			</div>

	<footer>
	
		<div class="container">
		  <h2>Contact Us</h2>
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
                  DATE: Fri Nov 24 21:31:02 GMT 2017
                  SOURCE: /home/brandon/Yanika-Web/WebDev-CA2/WebCA2/app/views/booking.scala.html
                  HASH: 4769ab75f6d6d779c83b0698d1aff077ed466146
                  MATRIX: 1032->0|6633->5572|6663->5573|6693->5574|6763->5615|6793->5616|7257->6051|7287->6052|7317->6053|7387->6094|7417->6095
                  LINES: 33->1|170->138|170->138|170->138|170->138|170->138|176->144|176->144|176->144|176->144|176->144
                  -- GENERATED --
              */
          