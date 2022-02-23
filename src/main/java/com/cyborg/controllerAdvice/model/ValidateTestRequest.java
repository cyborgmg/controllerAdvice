package com.cyborg.controllerAdvice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class ValidateTestRequest {

    @NotBlank(message = "id não pode estar em branco")
    private String id;

    @NotNull(message = "valor no pode estar nulo")
    private Integer valor;

}
