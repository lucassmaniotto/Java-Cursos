package br.com.alura.adopet.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SolicitacaoAdocaoDto(
    @NotNull
    Long tutorId,

    @NotNull
    Long petId,

    @NotBlank
    String motivo
) {}
