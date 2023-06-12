package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aplicativo.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String>{

}
