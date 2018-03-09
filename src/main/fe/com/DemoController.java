package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hcz on 2018-3-9.
 */
@Controller
@RequestMapping("/demo")
//提示Spring MVC这是一个Controller，以及拦截根文件夹下的hello
public class DemoController {
    //host:port/demo/index
    @RequestMapping("/index")
    public String index(){
        System.out.println(">>>>>>>>>>> This is DemoController.");
        return "demo";
    }
}
