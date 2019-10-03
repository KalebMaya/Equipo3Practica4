package com.everis.equipo3practica4enviaremail.model;
// Generated 3/10/2019 11:54:22 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Producto implements java.io.Serializable {

	private Integer idproducto;
	private String descripcion;
	private String nombre;
	private double precio;
	private String imagen;
	@JsonIgnore
	private Set<Inventario> inventarios = new HashSet<Inventario>(0);

	public Producto() {
	}

	public Producto(String descripcion, String nombre, double precio, String imagen) {
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
	}

	public Producto(String descripcion, String nombre, double precio, String imagen, Set<Inventario> inventarios) {
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
		this.inventarios = inventarios;
	}

	public Integer getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set<Inventario> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(Set<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

}
