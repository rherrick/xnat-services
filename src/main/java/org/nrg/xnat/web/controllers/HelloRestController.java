package org.nrg.xnat.web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/data")
@Slf4j
public class HelloRestController {
    @Autowired
    public HelloRestController(final MessageSource messageSource) {
        _messageSource = messageSource;
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
    public List<String> getNames() {
        return Arrays.asList(_messageSource.getMessage("hello.names", null, Locale.getDefault()).split("\\s*,\\s*"));
    }

    private final MessageSource _messageSource;
}
