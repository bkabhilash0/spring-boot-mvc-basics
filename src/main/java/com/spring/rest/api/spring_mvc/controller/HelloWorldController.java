package com.spring.rest.api.spring_mvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/showForm",method = RequestMethod.GET)
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

//    @RequestMapping("/processFormVersionTwo")
//    public String letsShoutDude(HttpServletRequest request, Model model) {
//        String name = request.getParameter("studentName");
//        name = name.toUpperCase();
//        String result = "Yo! "+name;
//        model.addAttribute("message",result);
//        return "helloworld";
//    }

//    @GetMapping("/processFormVersionTwo")
//    public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
//        name = name.toUpperCase();
//        String result = "Yo! Hey "+name;
//        model.addAttribute("message",result);
//        return "helloworld";
//    }

    @PostMapping("/processFormVersionThree")
    public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();
        String result = "Yo! Hola "+name;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
