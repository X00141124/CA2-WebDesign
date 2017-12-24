
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

object addFlight extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Flight],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(flightForm: Form[models.Flight], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add flight", user)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new flight</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addFlightSubmit(),'class -> "form-horizontal", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
    """),format.raw/*9.33*/("""
    """),format.raw/*10.95*/("""
    """),_display_(/*11.6*/CSRF/*11.10*/.formField),format.raw/*11.20*/("""

    """),_display_(/*13.6*/inputText(flightForm("boarding"), '_label -> "From", 'class -> "form-control")),format.raw/*13.84*/("""
    """),_display_(/*14.6*/inputText(flightForm("arrival"), '_label -> "Destination", 'class -> "form-control")),format.raw/*14.90*/("""
    """),_display_(/*15.6*/inputText(flightForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/inputText(flightForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.82*/("""
    """),_display_(/*17.6*/inputText(flightForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.69*/("""


    """),format.raw/*20.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Flight" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.index),format.raw/*22.46*/("""">
            <buttom type="button" class="btn btn-warning">Cancel</buttom>
        </a>
    </div>

    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(flightForm:Form[models.Flight],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(flightForm,user)

  def f:((Form[models.Flight],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (flightForm,user) => apply(flightForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 01:56:32 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/addFlight.scala.html
                  HASH: 464ebc86185b9d41fe44699025b3998c17dba523
                  MATRIX: 983->1|1114->64|1159->59|1189->81|1217->84|1249->108|1288->110|1320->116|1390->161|1496->258|1536->260|1569->294|1603->390|1636->397|1649->401|1680->411|1715->420|1814->498|1847->505|1952->589|1985->596|2080->670|2113->677|2210->753|2243->760|2327->823|2364->833|2513->955|2528->961|2570->982|2712->1094
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|52->20|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          