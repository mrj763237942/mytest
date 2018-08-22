package com.example.demo;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

import groovy.util.logging.Slf4j;

@Slf4j
public class ApplicationPreparedEventListener
		implements ApplicationListener<ApplicationPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		System.out.println("......ApplicationPreparedEvent......");
	}

}
