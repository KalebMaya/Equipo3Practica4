package com.everis.equipo3practica4.model;
// Generated 3/10/2019 10:31:07 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "practica4")
public class Producto implements java.io.Serializable {

	private Integer idproducto;
	private String descripcion;
	private String nombre;
	private double precio;
	private String url;
	private int stock;
	private Set<PedidoHasProducto> pedidoHasProductos = new HashSet<PedidoHasProducto>(0);

	public Producto() {
	}

	public Producto(String descripcion, String nombre, double precio, String url, int stock) {
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.url = url;
		this.stock = stock;
	}

	public Producto(String descripcion, String nombre, double precio, String url, int stock,
			Set<PedidoHasProducto> pedidoHasProductos) {
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.url = url;
		this.stock = stock;
		this.pedidoHasProductos = pedidoHasProductos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idproducto", unique = true, nullable = false)
	public Integer getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "descripcion", nullable = false, length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "precio", nullable = false, precision = 22, scale = 0)
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Column(name = "url", nullable = false, length = 50)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "stock", nullable = false)
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<PedidoHasProducto> getPedidoHasProductos() {
		return this.pedidoHasProductos;
	}

	public void setPedidoHasProductos(Set<PedidoHasProducto> pedidoHasProductos) {
		this.pedidoHasProductos = pedidoHasProductos;
	}

}