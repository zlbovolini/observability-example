package com.github.zlbovolini.health.check.status;

import io.opentracing.Span;
import io.opentracing.Tracer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    private final Tracer tracer;

    public AppController(Tracer tracer) {
        this.tracer = tracer;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        Span span = tracer.activeSpan();

        span.setTag("user", "lucas");

        return ResponseEntity.ok("Hello World");
    }
}
