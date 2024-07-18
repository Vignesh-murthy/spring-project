package com.socialmedia.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/analytics")
public class Controller {
    @Autowired
    private SocialMediaAnalyticsService service;


    @GetMapping
    public List<SocialMediaAnalytics> getAnalytics() {
        return service.getAllAnalytics();
    }
}
