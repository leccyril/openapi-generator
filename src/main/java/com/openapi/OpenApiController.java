package com.openapi;


import com.openapi.generated.TestApi;
import com.openapi.generated.TestRequest;
import com.openapi.generated.TestResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
@AllArgsConstructor
@Slf4j
public class OpenApiController implements TestApi {

	@Override
	public Mono<ResponseEntity<TestResponse>> createTest(Mono<TestRequest> testRequest, ServerWebExchange exchange) {
		return null;
	}

	@Override
	public Mono<ResponseEntity<TestResponse>> getObject(String id, ServerWebExchange exchange) {
		return null;
	}
}