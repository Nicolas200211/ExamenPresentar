package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Articulo;
import com.proyecto.aplicativo.repository.ArticuloRepository;
@Service
public class ArticuloServiceImplements implements ArticuloService{
@Autowired
  ArticuloRepository ar;
	@Override
	public Articulo registrar(Articulo a) {
		// TODO Auto-generated method stub
		return ar.save(a) ;
	}

	@Override
	public Articulo actualizar(Articulo a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}

	@Override
	public void eliminar(Articulo a) {
		// TODO Auto-generated method stub
		ar.delete(a);
	}

	@Override
	public List<Articulo> ver() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

}
