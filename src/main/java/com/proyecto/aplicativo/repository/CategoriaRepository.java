package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aplicativo.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, String>{

}
