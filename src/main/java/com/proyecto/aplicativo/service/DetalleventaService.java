package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Detalleventa;

public interface DetalleventaService {
	public Detalleventa registrar (Detalleventa a);
	public Detalleventa actualizar(Detalleventa a);
	public void eliminar (Detalleventa a);
	public  List<Detalleventa>ver();
}
