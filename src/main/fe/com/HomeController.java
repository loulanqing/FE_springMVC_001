package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hcz on 2018-3-9.
 */
@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(Model model) {
        return "index";
    }

}
