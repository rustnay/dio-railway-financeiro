package com.cristiano.finaceiro.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class CategoriaDTO {

    private UUID id;
    private String nome;
    private String descricao;
    private GrupoCategoriaDTO grupo;
}
