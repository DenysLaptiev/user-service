package com.springboot.user_service.service;

import org.springframework.cloud.aws.messaging.config.annotation.NotificationSubject;
import software.amazon.awssdk.services.sns.model.SubscribeResponse;

public interface SNSService {

    SubscribeResponse subscribeHTTPToImageToUserTopic(String url);

    void processSNSMessage(String message, String subject);
}
