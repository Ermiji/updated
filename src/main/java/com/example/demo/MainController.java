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

    @Autowired
    PullRepository pullRepository;

    @Autowired
    CollaboratorsRepository collaboratorsRepository;

    @RequestMapping("/")
    public String Home(Model model /*,String login*/) {
        model.addAttribute("users",userRepository.findAll());
        //model.addAttribute("counter",userRepository.countByLogin(login));
//user's count
        return "homepage";
    }
//    @RequestMapping("/userDetail/{login}")
//    public String showDetail(@PathVariable("login") String login, Model model) {
//        model.addAttribute("repos", repoRepository.findAll());
//        model.addAttribute("user",userRepository.findByLogin(login));
////user's count
//        return "userpage";
//    }

    @RequestMapping("/userDetail/{login}")
    public String userDetails(@PathVariable("login") String login, Model model, String name) {
        model.addAttribute("user",userRepository.findByLogin(login));
        // model.addAttribute("user",userRepository.findById(id));
//user's count
        model.addAttribute("repo",repoRepository.findByName(name) );
        model.addAttribute("repos",repoRepository.findAll());

        return "userpage";
    }

    @RequestMapping("/repoDetail/{name}")
    public String reposDetail(@PathVariable("name") String name,Model model,String login) {
        model.addAttribute("repo",repoRepository.findByName(name));
        //model.addAttribute("pulls",pullRepository.findAll());
        //model.addAttribute("collaborators", collaboratorsRepository.findAll());
       // model.addAttribute("collaborator", collaboratorsRepository.findByLogin(login));

        return "repodetails";
    }

    @RequestMapping("/collaborator/{login}")
    public String showCollaborators(@PathVariable("login") String login, Model model, String name) {

        model.addAttribute("repo",repoRepository.findByName(name));
        //model.addAttribute("collaborators", collaboratorsRepository.findAll());
  model.addAttribute("collaborator", collaboratorsRepository.findByLogin(login));

        return "collaboratorspage";
    }
//    public String showCollaborators(@PathVariable("login") String login, Model model) {
//
//        //model.addAttribute("repo",repoRepository.findByName(name) );
//        model.addAttribute("collaborators", collaboratorsRepository.findAll());
//        model.addAttribute("collaborator", collaboratorsRepository.findByLogin(login));
//
//        return "collaboratorspage";
//    }
    //    @RequestMapping("/repopage")
//    public String repoPage(Model model /*,String login*/) {
//        model.addAttribute("repos",repoRepository.findAll());
//        //model.addAttribute("counter",userRepository.countByLogin(login));
////user's count
//        return "collaboratorspage";
//    }

}
