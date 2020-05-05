package zcm.com.github.SpringSecurity.filters;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Order(2)
@Component
public class HeaderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("HeaderFilter :: doFilter()");
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.addHeader("Kto-jest-kurwom", "Piotr Kowalski");
        chain.doFilter(request, httpResponse);
    }

    @Override
    public void destroy() {

    }
}
