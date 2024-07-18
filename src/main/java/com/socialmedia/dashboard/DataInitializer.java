package com.socialmedia.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private SocialMediaAnalyticsRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize with some dummy data
        SocialMediaAnalytics analytics = new SocialMediaAnalytics();
        analytics.setName("Vignesh");
        analytics.setCategory("FullStack Developer");
        analytics.setBio("Love Your Enemies");
        analytics.setContactOptions("vignesh.murthy17@gmail.com");
        analytics.setLinks("https://www.linkedin.com/in/vignesh-murthy-396101252?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app");
        analytics.setNumberOfFollowers(1000);
        analytics.setNumberOfFollowing(1);
        analytics.setNumberOfPosts(50);
        analytics.setTotalStories(20);
        analytics.setTotalFollows(1);
        analytics.setTotalSaves(300);
        analytics.setTotalComments(200);
        analytics.setTotalShares(100);
        repository.save(analytics);
    }
}
