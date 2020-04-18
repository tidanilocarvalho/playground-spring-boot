package com.example.springboot.metrics;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

        long startMillis = System.currentTimeMillis();
		
		chain.doFilter(request, response);
	
	    String log = String.format("Request %s, Response Status %s, Elapsed Time %s millis", req.getRequestURI(), res.getStatus(), (System.currentTimeMillis() - startMillis));
	    System.out.println(log);
	}
}