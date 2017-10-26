package com.greenfox.helloworldbean;

import com.greenfox.helloworldbean.Config.HelloWorldConfig;
import com.greenfox.helloworldbean.Model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloworldbeanApplication {


	@Autowired
	HelloWorld helloWorld;


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage();
		helloWorld.getMessage();
	}
}
