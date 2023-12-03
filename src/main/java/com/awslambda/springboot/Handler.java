/**
 * 
 */
package com.awslambda.springboot;

import java.util.Map;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Kanthu
 *
 */
@Component
public class Handler implements Consumer<Map<String, String>> {
	
	@Value("${server.port}")
	String port;
	
	@Value("${server.servlet.application-display-name}")
	String applicationDisplayName;
	
	@Value("${server.error.whitelabel.enabled}")
	String errorWhiteLabelEnabled;
	
	public String handleRequest(Map<String, String> map) {
		
		System.out.println(" map : "+map);
		
		System.out.println("done!!"+port);
		
		System.out.println("App Display Name !!"+applicationDisplayName);
		
		System.out.println("erroWhiteLabelEnabled !! "+errorWhiteLabelEnabled);
		
		return "done!!"+port;
	}

	@Override
	public void accept(Map<String, String> t) {
		handleRequest(t);
	}

}
