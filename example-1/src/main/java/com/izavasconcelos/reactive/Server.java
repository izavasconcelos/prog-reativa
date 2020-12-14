package com.izavasconcelos.reactive;

import com.sun.net.httpserver.HttpServer;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.from;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


public class Server {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public void startReactorServer() {
        RouterFunction<?> route = route(GET("/hello"),
                request -> ok().body(fromObject("Hello Reactive world!")));


    }
}
