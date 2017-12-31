package org.nrg.xnat.web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Locale;

@Controller
@RequestMapping("/")
@Slf4j
public class HelloController {
    @Autowired
    public HelloController(final MessageSource messageSource) {
        _messageSource = messageSource;
    }

    @GetMapping("/")
    public RedirectView getIndex() {
        return new RedirectView("/hello");
    }

    @GetMapping("hello")
    public ModelAndView getHello() {
        return new ModelAndView("hello") {{
            addObject("message", _messageSource.getMessage("hello.message", null, Locale.getDefault()));
        }};
    }

    private final MessageSource _messageSource;
}
