package com.ivan;

import com.ivan.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class PingController {

    @Autowired
    private FirstService firstService;

    @RequestMapping(method = RequestMethod.GET)
    public String ping() {
        return firstService.ping();
    }

}
