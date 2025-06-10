package com.palette_api.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PintorDTO {
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;
    private String nacionalidade;
}

