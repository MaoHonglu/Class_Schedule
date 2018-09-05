package cn.aftsky.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String home(){
        return "index";
    }
}