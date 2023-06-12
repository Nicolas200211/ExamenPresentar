package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table( name="categoria")
@Entity(name="categoria")
public class Categoria {
	
@Id String categoria;
String nombre;
String descripcion;
String condicion;
public Categoria() {
	super();
}
public Categoria(String categoria, String nombre, String descripcion, String condicion) {
	super();
	this.categoria = categoria;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.condicion = condicion;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getCondicion() {
	return condicion;
}
public void setCondicion(String condicion) {
	this.condicion = condicion;
}
}
