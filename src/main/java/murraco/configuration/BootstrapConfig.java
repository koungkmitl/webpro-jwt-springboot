package murraco.configuration;

import murraco.service.bootstrapper.BootstrapService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapConfig {

    @Bean
    public ApplicationListener<ApplicationReadyEvent> bootstrapOnReady(BootstrapService bootstrapService) {
        return applicationReadyEvent -> bootstrapService.bootstrap();
    }
}
