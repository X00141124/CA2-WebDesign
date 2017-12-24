package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    public Result africa() {
        return ok(views.html.africa.render());
    }
    public Result america() {
        return ok(views.html.america.render());
    }
    public Result asia() {
        return ok(views.html.asia.render());
    }
    public Result australia() {
        return ok(views.html.australia.render());
    }
    public Result booking() {
        return ok(views.html.booking.render());
    }
    public Result deals() {
        return ok(views.html.deals.render());
    }
    public Result essential() {
        return ok(views.html.essential.render());
    }
    public Result europe() {
        return ok(views.html.europe.render());
    }
    public Result flight() {
        List<Flight> flightList = Flight.findAll();
        return ok(views.html.flight.render(flightList, User.getUserById(session().get("email"))));
    }
    public Result hotels() {
        return ok(views.html.hotels.render());
    }
    public Result signup() {
        return ok(views.html.signup.render());
    }

    public Result addFlight() {
        Form<Flight> flightForm = formFactory.form(Flight.class);
        return ok(addFlight.render(flightForm, User.getUserById(session().get("email"))));
    }

    public Result addFlightSubmit() {
        Form<Flight> newFlightForm = formFactory.form(Flight.class).bindFromRequest();

        if (newFlightForm.hasErrors()) {
            return badRequest(addFlight.render(newFlightForm, User.getUserById(session().get("email"))));

        } else {
            Flight newFlight = newFlightForm.get();

            newFlight.save();

            flash("success", "Flight from" + newFlight.getBoarding() + " to " + newFlight.getArrival() + " was added");

            return redirect(controllers.routes.HomeController.index());
        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteFlight(Long id) {

        Flight.find.ref(id).delete();

        flash("success", "Flight has been deleted");

        return redirect(routes.HomeController.index());
    }

   
}
