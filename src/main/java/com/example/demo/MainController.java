package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {







    //        @Autowired
//        CloudinaryConfig cloudinaryConfig;
    @Autowired
    UserRepository userRepository;

    @Autowired
    RepoRepository repoRepository;


    @RequestMapping("/")
    public String Home(Model model /*,String login*/) {
        model.addAttribute("users",userRepository.findAll());
        //model.addAttribute("counter",userRepository.countByLogin(login));
//user's count
        return "homepage";
    }
    @RequestMapping("/userDetail/{login}")
    public String showDetail(@PathVariable("login") String login, Model model) {
        model.addAttribute("user",userRepository.findByLogin(login));
        // model.addAttribute("user",userRepository.findById(id));
//user's count
        return "userpage";
    }




}
