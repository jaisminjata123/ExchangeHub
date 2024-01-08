package com.microservices.namingserver;

import org.springframework.boot.SpringApplication;
import java.util.*;
import java.util.stream.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerApplication.class, args);
//		 List<String> ls = Arrays.asList("Hello","world","aa","bb");
//	        List<String> ans;
//	        ans = ls.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
//	        System.out.println(ans);
//	        
	        
	}

}
