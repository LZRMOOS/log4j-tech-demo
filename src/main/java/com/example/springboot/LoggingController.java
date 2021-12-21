package com.example.springboot;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

  private static final Logger LOGGER = LogManager.getLogger(LoggingController.class);

	@GetMapping("/")
  @ResponseBody
	public String index(@RequestParam String id) {
    LOGGER.info("------------------Logging using l4j2!------------------");
    LOGGER.info("Request ID:" + id);
		return "Greetings from Spring Boot!";
	}
  
}