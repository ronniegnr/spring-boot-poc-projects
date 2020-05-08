package bd.com.ronnie.springbootmarkdowneditorpoc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.HOME_VIEW;

@Controller
public class HomeController {

    @GetMapping("")
    public String getHome() {
        return HOME_VIEW;
    }
}
