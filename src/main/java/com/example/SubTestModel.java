package com.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.hateoas.AbstractResource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Produces({MediaType.APPLICATION_HAL_JSON})
@Introspected
public class SubTestModel extends AbstractResource<SubTestModel> {

    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String foo;
    private String bar;

}
