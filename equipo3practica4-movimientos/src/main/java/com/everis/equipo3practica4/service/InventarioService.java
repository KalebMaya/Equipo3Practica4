package com.everis.equipo3practica4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo3practica4.model.Inventario;
import com.everis.equipo3practica4.model.Producto;
import com.everis.equipo3practica4.model.repository.InventarioRepository;

@Service
public class InventarioService {

	
	@Autowired 
	InventarioRepository inventarioRepository;

	public Inventario insertarInventario(Inventario inventario) {
		
		return inventarioRepository.save(inventario);
		
	}
	
	public List<Inventario>inventarioRepository( Producto producto){
		return inventarioRepository.findByProducto(producto);
	}
	
	
	
}
