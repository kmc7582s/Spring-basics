package org.kgitbank.study.hello;

import org.kgitbank.study.Ihello.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloAddtionService implements IHelloService {
	
	public String hello(String name) {
		return "안녕하세요. "+name+"!";
	}
	
}
