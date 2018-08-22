package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import groovy.util.logging.Slf4j;

@Slf4j
public class ApplicationReadyEventListener
		implements ApplicationListener<ApplicationReadyEvent> {

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("......ApplicationReadyEvent......");
	}

}
