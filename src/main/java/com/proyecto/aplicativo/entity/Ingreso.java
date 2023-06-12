package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="ingreso")
@Entity(name="ingreso")
public class Ingreso {
@Id String ingreso;
String proveedor;
String tipo_comprobante;
String serie_comprobante;
String num_comprobante;
String fecha_hora;
int imppuesto;
String estado;
public Ingreso() {
	super();
}
public Ingreso(String ingreso, String proveedor, String tipo_comprobante, String serie_comprobante,
		String num_comprobante, String fecha_hora, int imppuesto, String estado) {
	super();
	this.ingreso = ingreso;
	this.proveedor = proveedor;
	this.tipo_comprobante = tipo_comprobante;
	this.serie_comprobante = serie_comprobante;
	this.num_comprobante = num_comprobante;
	this.fecha_hora = fecha_hora;
	this.imppuesto = imppuesto;
	this.estado = estado;
}
public String getIngreso() {
	return ingreso;
}
public void setIngreso(String ingreso) {
	this.ingreso = ingreso;
}
public String getProveedor() {
	return proveedor;
}
public void setProveedor(String proveedor) {
	this.proveedor = proveedor;
}
public String getTipo_comprobante() {
	return tipo_comprobante;
}
public void setTipo_comprobante(String tipo_comprobante) {
	this.tipo_comprobante = tipo_comprobante;
}
public String getSerie_comprobante() {
	return serie_comprobante;
}
public void setSerie_comprobante(String serie_comprobante) {
	this.serie_comprobante = serie_comprobante;
}
public String getNum_comprobante() {
	return num_comprobante;
}
public void setNum_comprobante(String num_comprobante) {
	this.num_comprobante = num_comprobante;
}
public String getFecha_hora() {
	return fecha_hora;
}
public void setFecha_hora(String fecha_hora) {
	this.fecha_hora = fecha_hora;
}
public int getImppuesto() {
	return imppuesto;
}
public void setImppuesto(int imppuesto) {
	this.imppuesto = imppuesto;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
}
