package com.everis.equipo3practica4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo3practica4.model.Producto;
import com.everis.equipo3practica4.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	
	@PostMapping("/")
	public Producto registrar(@RequestBody Producto producto) {
		return productoService.insertar(producto);
	}
}
