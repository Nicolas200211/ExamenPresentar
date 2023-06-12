package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Venta;

public interface VentaService {
 
	public Venta registrar(Venta a);
	public Venta actualizar(Venta a);
	public void eliminar (Venta a);
	public List<Venta> ver();
}
