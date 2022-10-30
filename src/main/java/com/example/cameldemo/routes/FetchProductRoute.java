package com.example.cameldemo.routes;

import com.example.cameldemo.service.ProductService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FetchProductRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:fetchProducts")
                .routeId("direct-fetchProducts")
                .tracing()
                .log(">>> ${body}")
                .bean(ProductService.class, "queryProductsByCategory")
                .end();
    }
}
