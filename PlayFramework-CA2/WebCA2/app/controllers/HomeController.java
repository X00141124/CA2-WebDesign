package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

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
        return ok(views.html.flight.render());
    }
    public Result hotels() {
        return ok(views.html.hotels.render());
    }
    public Result login() {
        return ok(views.html.login.render());
    }
    public Result signup() {
        return ok(views.html.signup.render());
    }
    
}
