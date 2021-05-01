package com.deadpool.emergencydepartment.secutrity;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtRequestFilter extends OncePerRequestFilter {

    private final JwtTokenService jwtTokenService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String tokenHeaderValue = null;//httpServletRequest.getHeader();
        String userName;
        String jwtToken = null;
        if (tokenHeaderValue!=null && tokenHeaderValue.startsWith("Bearer")){
            jwtToken = tokenHeaderValue.substring(7);

        }

        userName = jwtTokenService.getUserNameFromToken(jwtToken);
        val context = SecurityContextHolder.getContext();
        if (userName !=null && context.getAuthentication() == null ) {

        }
    }
}
