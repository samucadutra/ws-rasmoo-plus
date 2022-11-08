package com.client.ws.rasmooplus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTypeDto {

    private Long id;

    @NotBlank(message = "valor não pode ser nulo ou vazio")
    @Size(min = 6, message = "valor mínimo igual a 6 caracteres")
    private String name;

    @NotBlank(message = "valor não pode ser nulo ou vazio")
    @Size(min = 6, message = "valor mínimo igual a 6 caracteres")
    private String description;
}
