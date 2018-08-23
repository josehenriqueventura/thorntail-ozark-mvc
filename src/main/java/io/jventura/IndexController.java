package io.jventura;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * https://www.thymeleaf.org/doc/articles/standarddialect5minutes.html
 */
@Controller
@Path("/")
public class IndexController {

    @Inject
    private Models models;

    @GET
    @View("index.html")
    public void index() {
        models.put("content", "Content Rendered by Thymeleaf");
    }
}
