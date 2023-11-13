package com.springboot.user_service.config.aws.sns;

import com.springboot.user_service.service.SNSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import software.amazon.awssdk.services.sns.model.SubscribeResponse;

@Configuration
@Slf4j
public class InitialConfiguration {

    @Value("${image-service.server.baseurl}")
    private String IMAGE_SERVICE_SERVER_BASE_URL;

    private final SNSService snsService;

    @Autowired
    public InitialConfiguration(SNSService snsService) {
        this.snsService = snsService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent() {

        String url = IMAGE_SERVICE_SERVER_BASE_URL + "/image-to-user-subscriber" ;
        log.info("---> InitialConfiguration: subscribeHTTPToImageToUserTopic: url=" + url);

        SubscribeResponse subscribeResponse = snsService.subscribeHTTPToImageToUserTopic(url);
        log.info("---> InitialConfiguration: subscribeHTTPToImageToUserTopic: subscribeResponse=" + subscribeResponse);
    }
}
