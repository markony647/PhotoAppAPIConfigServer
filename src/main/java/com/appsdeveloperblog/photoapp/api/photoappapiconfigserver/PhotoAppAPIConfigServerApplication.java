package com.appsdeveloperblog.photoapp.api.photoappapiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppAPIConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppAPIConfigServerApplication.class, args);
    }

}
