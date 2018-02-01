package cn.liusf.gwt.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liusf on 2018/1/29.
 */
@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
