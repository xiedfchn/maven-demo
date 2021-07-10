package org.dclar.releasetesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReleaseTestingApplication {

	public static void main(String[] args) {

		// upgrade
		// upgrade to 1.2
		SpringApplication.run(ReleaseTestingApplication.class, args);
	}

}
