package com.idat.EF_RamirezEmilio_ConfingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfRamirezEmilioConfingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRamirezEmilioConfingserverApplication.class, args);
	}

}
