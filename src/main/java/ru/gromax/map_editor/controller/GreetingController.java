package ru.gromax.map_editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/greeting")
public class GreetingController {
    @GetMapping
    public String login() {
        return "map";
    }
}
