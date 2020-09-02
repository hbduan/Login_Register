package com.duan.login_duan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LoginDuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginDuanApplication.class, args);
	}

}
