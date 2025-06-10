package com.palette_api.dto;

import lombok.Data;

@Data
public class ObraArteDTO {
    private String nome;
    private Integer anoCriacao;
    private String tecnica;
    private Long pintorId;
}
