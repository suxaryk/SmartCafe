package com.smartcafe.web.conroller;

import com.smartcafe.web.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BarmenController {

    @Autowired
    CafeService cafeService;

    @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
    public String Authentication(HttpServletRequest request, ModelMap model) {
//        Integer tableCount = cafeService.get(1).getTableCount();
//        request.getSession().setAttribute("tableCount", tableCount);
//        model.addAttribute("tableCount", tableCount);
        return "table";
    }


}
