package com.everis.equipo3practica4enviaremail.repository;

public interface EmailRepository {
	
	public void enviarCorreoHTML(String email, String asunto, String html);
}
