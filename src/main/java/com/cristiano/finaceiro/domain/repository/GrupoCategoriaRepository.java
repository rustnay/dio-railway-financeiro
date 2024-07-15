package com.cristiano.finaceiro.domain.repository;

import com.cristiano.finaceiro.domain.model.GrupoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GrupoCategoriaRepository extends JpaRepository<GrupoCategoria, UUID> {
}
