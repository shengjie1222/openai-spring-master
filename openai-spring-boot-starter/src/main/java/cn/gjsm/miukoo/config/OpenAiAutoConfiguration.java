package cn.gjsm.miukoo.config;

import cn.gjsm.api.openai.OpenAiClient;
import cn.gjsm.api.openai.OpenAiClientFactory;
import cn.gjsm.miukoo.properties.OpenAiProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * 自动配置类
 */
@Configuration
@EnableConfigurationProperties(OpenAiProperties.class)
public class OpenAiAutoConfiguration {

    @Bean
    public OpenAiClient openAiClient(OpenAiProperties openAiProperties){
        return OpenAiClientFactory.builder()
                .readTimeout(Duration.ofMillis(openAiProperties.getTimeout()))
                .connectTimeout(Duration.ofMillis(openAiProperties.getTimeout()))
                .build()
                .createClient(openAiProperties.getToken());
    }


}
