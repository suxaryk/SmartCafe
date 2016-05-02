package com.smartcafe.web.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AdminController {

    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String Authentication(ModelMap model) {
        return "admin";
    }


}
