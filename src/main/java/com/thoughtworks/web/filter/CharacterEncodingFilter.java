package com.thoughtworks.web.filter;


import com.thoughtworks.util.EncodingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CharacterEncodingFilter extends OncePerRequestFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(CharacterEncodingFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        request.setCharacterEncoding(EncodingUtils.UTF_8);
        response.setCharacterEncoding(EncodingUtils.UTF_8);
        filterChain.doFilter(request, response);
    }
}