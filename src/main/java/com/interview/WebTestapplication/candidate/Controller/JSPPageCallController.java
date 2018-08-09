package com.interview.WebTestapplication.candidate.Controller;

import com.interview.WebTestapplication.candidate.Repository.POCRepository;
import com.interview.WebTestapplication.candidate.Repository.UserRepository;
import com.interview.WebTestapplication.candidate.Services.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
@RequestMapping("/candidateTesting")
public class JSPPageCallController {

    @Autowired
    LoginService loginservice;

    @Autowired
    UserRepository repository;

    @Autowired
    POCRepository pocrepo;

    @ApiOperation(value = "Login",response = String.class)
    @RequestMapping(value = "/login", method= RequestMethod.GET,produces = "application/json")
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @ApiOperation(value = "welcome",response = String.class)
    @RequestMapping(value = "/welcome", method= RequestMethod.GET,produces = "application/json")
    public String showWelcomePage(ModelMap model)
    {
        return "welcome";
    }



//    @RequestMapping(value="/findbyFullname", method = RequestMethod.GET)
//    public String findemployeeFullname(ModelMap model)
//    {
//        return "backbutton";
//    }


}
