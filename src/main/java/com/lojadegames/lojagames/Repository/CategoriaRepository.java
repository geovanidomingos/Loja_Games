package com.lojadegames.lojagames.Repository;

import com.lojadegames.lojagames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.DoubleStream;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);



}
