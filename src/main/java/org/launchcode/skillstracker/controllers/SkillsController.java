package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String initialText() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1> Skills Tracker <h1/>" +
                        "<h2> We have a few skills we would like you to learn. Here is the list! <h2/>" +
                        "<ol>" +
                        "<li> Java <li/>" +
                        "<li> Python <li/>" +
                        "<ol/>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/form'>" +
                        "<input type = 'text' name = 'language' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
