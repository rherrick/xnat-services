package org.nrg.xnat.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello() {
        return new ModelAndView("hello") {{
            addObject("message", "Hello world!");
        }};
    }
}
