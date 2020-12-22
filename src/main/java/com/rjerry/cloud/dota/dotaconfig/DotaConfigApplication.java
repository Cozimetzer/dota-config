package com.rjerry.cloud.dota.dotaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DotaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotaConfigApplication.class, args);
    }

}
