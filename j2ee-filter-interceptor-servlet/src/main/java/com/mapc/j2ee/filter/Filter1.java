package com.mapc.j2ee.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@Order(1)
@Component
@WebFilter(urlPatterns="/*", filterName="filter1")
public class Filter1 implements Filter {
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
