package top.mczhangyi.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 张易
 * 2019/12/22-21:43
 */
@Controller
public class HelloController {

    @GetMapping("/")
        public String index(){
        return "index";

}
}
