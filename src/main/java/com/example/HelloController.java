package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("/hello")
public class HelloController {

    @Post(uri = "/", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_HAL_JSON)
    public HttpResponse<TestModel> create(@Body final TestModel testModel) {
        log.info("testModel: {}", testModel);
        return HttpResponse.status(HttpStatus.OK).body(testModel);
    }

}
