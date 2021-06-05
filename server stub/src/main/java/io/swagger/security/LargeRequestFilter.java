package io.swagger.security;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;


@Component
@Order(1)
public class LargeRequestFilter implements Filter {

    private final Logger log = Logger.getLogger(this.getClass().getName());


    private int maxSize = 100;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        int size = request.getContentLength();
        log.info("Request size: " + size);
        if (size > maxSize) {
            log.severe("request size too large. Size: " + size);
            throw new ServletException("Request too large");
        }
        else {
            chain.doFilter(request, response);
        }
    }
}
