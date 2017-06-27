package com.ac;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NextInsuranceClaimMsApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(NextInsuranceClaimMsApplication.class).web(true).run(args);
	}
}
