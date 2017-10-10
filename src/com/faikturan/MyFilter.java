package com.faikturan;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class MyFilter implements Filter {

    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

    public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init method called.....");
	} 
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter method call....");
	}
    
	public void destroy() {
		System.out.println("destroy method call.....");
	}
	

	

}
