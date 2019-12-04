package com.mapc.j2ee.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@Order(2)
@Component
@WebFilter(urlPatterns="/*", filterName="filter2")
public class Filter2 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("{}初始化完成",this.getClass().getName());
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("{}执行过滤开始....",this.getClass().getName());
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("{}执行过滤结束....",this.getClass().getName());
    }

    public void destroy() {
        log.info("{}销毁",this.getClass().getName());
    }
}
