package com.example.linkit.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class AuthConfig {
    private final Auth auth = new Auth();

    @Data
    public static class Auth {
        private String tokenSecret;
        private long accessTokenExpirationMsec;
        private long refreshTokenExpirationMsec;
        private String kakaoAdminKey;
    }

    public Auth getAuth() {
        return auth;
    }

}
