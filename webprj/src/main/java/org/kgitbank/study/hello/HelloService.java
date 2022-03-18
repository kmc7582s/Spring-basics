package org.kgitbank.study.hello;

import org.kgitbank.study.Ihello.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
	
	public String hello(String name) {
		return "hello "+name+"!";
	}
	
}
