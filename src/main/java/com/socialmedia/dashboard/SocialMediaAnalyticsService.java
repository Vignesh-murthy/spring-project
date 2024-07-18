package com.socialmedia.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SocialMediaAnalyticsService {
    @Autowired
    private SocialMediaAnalyticsRepository repository;

    public List<SocialMediaAnalytics> getAllAnalytics(){
        return repository.findAll();

    }
}
