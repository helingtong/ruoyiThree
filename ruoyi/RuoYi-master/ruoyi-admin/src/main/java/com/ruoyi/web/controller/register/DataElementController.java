package com.ruoyi.web.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register/data")
public class DataElementController {

    @GetMapping()
    public String concept()
    {
        return "dataElement";
    }

}

