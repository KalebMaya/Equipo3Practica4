package com.everis.equipo3practica4enviaremail.response;

import java.util.List;

import com.everis.equipo3practica4enviaremail.model.Inventario;
import com.everis.equipo3practica4enviaremail.model.Producto;

public class InventarioResponse {

	private boolean successful;
	private String message;
	private Producto value;
	private List<Inventario> lista;
	private int total;
	
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Producto getValue() {
		return value;
	}
	public void setValue(Producto value) {
		this.value = value;
	}
	public List<Inventario> getLista() {
		return lista;
	}
	public void setLista(List<Inventario> lista) {
		this.lista = lista;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
