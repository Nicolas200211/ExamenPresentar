package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Persona;

public interface PersonaService {

	public Persona registrar(Persona   a);
	public Persona  actualizar(Persona  a);
	public void eliminar(Persona   a);
	public List<Persona>ver();
}
