package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

    /**
     * Default application controller.
     * @return Rendered index page.
     */
    public Result index() {

        return ok(index.render("Your new application is ready."));
    }

}

