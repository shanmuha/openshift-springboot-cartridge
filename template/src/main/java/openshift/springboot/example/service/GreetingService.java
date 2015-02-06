package openshift.springboot.example.service;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import openshift.springboot.example.domain.Greeting;

@RestController
public class GreetingService {
	private static final Logger log = LoggerFactory.getLogger(GreetingService.class);
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	log.info("in greeting for name={}",name);
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
