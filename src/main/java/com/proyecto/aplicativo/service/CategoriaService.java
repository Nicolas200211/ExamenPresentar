package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Categoria;
@Service

public interface CategoriaService {

		public Categoria registrar(Categoria a);
		public Categoria actualizar(Categoria a);
		public void eliminar(Categoria a);
		public List<Categoria> ver();
		
}
