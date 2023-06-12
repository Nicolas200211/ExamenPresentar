package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Detalleingreso;

public interface DetalleingresoService {

	public Detalleingreso registrar (Detalleingreso a);
	public Detalleingreso actualizar(Detalleingreso a);
	public void eliminar (Detalleingreso a);
	public  List<Detalleingreso>ver();
}
