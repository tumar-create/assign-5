package com.example.smm;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        SocialMediaPost post = new SocialMediaPost("Summer collection is here!");

        SmmCampaign campaign = new SmmCampaign(new PostScheduler(new PublishImmediatelyStrategy()));
        System.out.println(post.getText());
        System.out.println("Publish now: " + campaign.schedulePost(post, now));

        campaign.setStrategy(new FixedTimeStrategy(now.plusDays(1).with(LocalTime.of(10, 0))));
        System.out.println("Publish at fixed time: " + campaign.schedulePost(post, now));

        campaign.setStrategy(new NextEngagementWindowStrategy(
                List.of(LocalTime.of(9, 0), LocalTime.of(13, 0), LocalTime.of(18, 30))));
        System.out.println("Publish at next active time: " + campaign.schedulePost(post, now));
    }
}
