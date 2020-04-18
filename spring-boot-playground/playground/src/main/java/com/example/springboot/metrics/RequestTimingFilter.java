package com.example.springboot.metrics;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class RequestTimingFilter implements WebFilter
{
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain)
    {
        long startMillis = System.currentTimeMillis();
        
        return chain.filter(exchange)
                .doOnSuccess(aVoid -> System.out.println("Elapsed Time: {}ms" + (System.currentTimeMillis() - startMillis)));
    }
}
