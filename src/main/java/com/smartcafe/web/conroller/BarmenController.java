package com.smartcafe.web.conroller;

import com.smartcafe.web.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BarmenController {

    @Autowired
    CafeService cafeService;

    //not work
    @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
    public String Authentication(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.isUserInRole("ROLE_ADMIN")){
            request.getRequestDispatcher("/admin").forward(request, response);
        }

        return "table";


    }


}
