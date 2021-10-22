package com.cpp.HelloSpring.web;

import com.cpp.HelloSpring.service.PersonService;
import com.cpp.HelloSpring.dao.PersonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//SPRING MVC CONTROLLER ANNOTATION
@Controller
@Slf4j
public class HomeController {
    
    //Injecting PersonDao Interface
    @Autowired
    private PersonService personService;
    
    @GetMapping("/")
    public String home(Model model) {
        
        var people = personService.listPeople();
        model.addAttribute("people", people);
        
        return "index";
    }

}
