package com.dh.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jhonny on 6/10/17.
 */
@Component
public class CorsFilter implements Filter{

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException, IOException {
        System.out.println("Filtering..............");
        HttpServletResponse response = (HttpServletResponse) res;

        response.setHeader("Access-Control-Allow-Origin", "localhost:900");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

}
