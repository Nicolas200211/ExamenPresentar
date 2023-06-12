package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Categoria;
import com.proyecto.aplicativo.repository.CategoriaRepository;
@Service
public class CategoriaServiceImplements  implements CategoriaService{
@Autowired
	CategoriaRepository c;
	@Override
	public Categoria registrar(Categoria a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public Categoria actualizar(Categoria a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public void eliminar(Categoria a) {
		// TODO Auto-generated method stub
		c.delete(a);
	}

	@Override
	public List<Categoria> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
