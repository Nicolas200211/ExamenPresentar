package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Ingreso;

public interface IngresoService {
	
		public Ingreso registrar(Ingreso  a);
		public Ingreso  actualizar(Ingreso a);
		public void eliminar(Ingreso  a);
		public List<Ingreso >ver();
}
