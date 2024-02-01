package br.com.alura.adopet.api.dto;

public record SolicitacaoAdocaoDto(
    Long tutorId,
    Long petId,
    String motivo
) {}
