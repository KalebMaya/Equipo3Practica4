package com.everis.equipo3practica4.response;

import com.everis.equipo3practica4.model.Producto;

public class InventarioResponse {

	private boolean successful;
	private String message;
	private Producto value;
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
	
	
	
}
