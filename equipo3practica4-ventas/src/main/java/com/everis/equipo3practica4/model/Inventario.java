package com.everis.equipo3practica4.model;
// Generated 3/10/2019 11:54:22 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Inventario generated by hbm2java
 */
@Entity
@Table(name = "inventario", catalog = "practica4")
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

	@Id

	@Column(name = "idinventario", unique = true, nullable = false)
	public int getIdinventario() {
		return this.idinventario;
	}

	public void setIdinventario(int idinventario) {
		this.idinventario = idinventario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "cantidad", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}