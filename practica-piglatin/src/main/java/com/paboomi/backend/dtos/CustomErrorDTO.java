package com.paboomi.backend.dtos;

public record CustomErrorDTO(
        int line,
        int column,
        String message
) {}
