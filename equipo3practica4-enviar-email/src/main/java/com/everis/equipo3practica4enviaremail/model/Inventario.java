package com.everis.equipo3practica4enviaremail.model;
// Generated 3/10/2019 11:54:22 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;

public class Inventario implements java.io.Serializable {

	private int idinventario;
	private Producto producto;
	private Date fecha;
	private int cantidad;

	public Inventario() {
	}

	public Inventario(int idinventario, Producto producto, Date fecha, int cantidad) {
		this.idinventario = idinventario;
		this.producto = producto;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}

	public int getIdinventario() {
		return this.idinventario;
	}

	public void setIdinventario(int idinventario) {
		this.idinventario = idinventario;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
