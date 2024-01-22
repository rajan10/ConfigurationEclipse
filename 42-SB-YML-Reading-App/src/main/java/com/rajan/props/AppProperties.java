package com.rajan.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data  //to create getters and setters
@Configuration //to represent that this class is a configuration for spring boot application
//Configuration classes contain methods annotated with @Bean that define application beans.
//@Configuration annotation is used to mark a class as a source of configuration information.
//when the Spring application starts, the AppProperties configuration class will be scanned, and the 
//myBean method will be invoked by the Spring IoC container. The returned MyBean instance will be managed 
//by Spring, and you can inject it into other parts of your application.

@EnableConfigurationProperties //to enable the properties and read the properties
//Configuration properties allow you to externalize configuration settings from your code.

@ConfigurationProperties(prefix = "rajanit")//Specifies that properties with the prefix "rajanit" should be mapped to the fields of this class
public class AppProperties {
	
	private Map<String, String> messages = new HashMap<>();//field name of type Map<String, String> is initialized

public Map<String,String> getMessages() {
return messages;}

public void setMessages(Map<String,String> messages) {
this.messages = messages;}
	
}

