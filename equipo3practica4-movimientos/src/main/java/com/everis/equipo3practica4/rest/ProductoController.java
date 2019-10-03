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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api (value= "REST servicio de productos")

@RequestMapping("productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@ApiOperation("Listar productos")
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	@ApiOperation("Insertar productos")
	@PostMapping("/")
	public Producto registrar(@RequestBody Producto producto) {
		return productoService.insertar(producto);
	}
}
