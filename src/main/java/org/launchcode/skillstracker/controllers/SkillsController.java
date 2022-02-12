package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")

    public String listOfSkills() {


        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @PostMapping("form")
    public String skillsForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }
/*
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String skillsFormPost(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";

    }*/

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = '/form'>" +
                "<p>Name</p>" +
                "<input type = 'text' name = 'name' placeholder='Name' />" +
                "<p>My favorite language</p>" +
                "<select name='language1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javaScript' >JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<p>My second favorite language</p>" +
                "<select name='language2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javaScript' >JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<p>My third favorite language</p>" +
                "<select name='language3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javaScript' >JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br /><br />" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
