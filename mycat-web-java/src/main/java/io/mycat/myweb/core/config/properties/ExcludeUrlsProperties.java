package io.mycat.myweb.core.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "exclude")
public class ExcludeUrlsProperties {

    public List<String> getTokenValidationUrls() {
        return tokenValidationUrls;
    }

    public void setTokenValidationUrls(List<String> tokenValidationUrls) {
        this.tokenValidationUrls = tokenValidationUrls;
    }

    private List<String> tokenValidationUrls;



}
