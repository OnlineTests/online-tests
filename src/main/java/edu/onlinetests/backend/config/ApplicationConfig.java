package edu.onlinetests.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.onlinetests")
@EnableAspectJAutoProxy
public class ApplicationConfig {

}
