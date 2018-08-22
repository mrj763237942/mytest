package com.example.demo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import groovy.util.logging.Slf4j;

@Slf4j
public class ApplicationStartedEventListener
		implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("......ApplicationStartedEvent......");
	}

}
