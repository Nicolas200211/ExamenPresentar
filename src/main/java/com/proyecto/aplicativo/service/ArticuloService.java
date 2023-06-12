package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Articulo;


public interface ArticuloService {
	public Articulo registrar(Articulo a);
	public Articulo actualizar(Articulo a);
	public void eliminar(Articulo a);
	public List<Articulo>ver();
}
