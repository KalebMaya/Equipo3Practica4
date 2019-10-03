package com.everis.equipo3practica4.rest;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo3practica4.model.Inventario;
import com.everis.equipo3practica4.model.Producto;
import com.everis.equipo3practica4.response.InventarioResponse;
import com.everis.equipo3practica4.service.InventarioService;
import com.everis.equipo3practica4.service.ProductoService;


@RestController
@RequestMapping("movimientos")
public class InventarioController {

	@Autowired
	InventarioService inventarioService;
	
	@Autowired
	ProductoService productoService;


	@PostMapping("/entrada-salida/producto/{idproducto}/entrada/{cantidad}")
	public InventarioResponse insertar(@PathVariable int idproducto, @PathVariable int cantidad) {

		InventarioResponse response = new InventarioResponse();
		Inventario inventario = new Inventario();
		Producto producto =  productoService.buscarId(idproducto);
		
		
		try {
			if (idproducto == producto.getIdproducto()) {

				inventario.setFecha(new Date());
				inventario.setCantidad(cantidad);
				inventario.setProducto(producto);
				inventarioService.insertarInventario(inventario);
				response.setValue(producto);
				response.setSuccessful(true);
				response.setMessage("Producto Actualizado");
			} else {
				response.setSuccessful(false);
				response.setMessage("No se puedo actualizar");

			}
		} catch (Exception e) {
			response.setSuccessful(false);
			response.setMessage(e.getMessage());
		}return response;
	}

	
	@GetMapping("/{id}")
	public List<Inventario> consulta(@PathVariable int id) {

		List<Inventario> listainvetarios= new ArrayList<>();
		
		InventarioResponse response = new InventarioResponse();

		Producto producto = new Producto();

		try {
			producto.setIdproducto(id);
			listainvetarios = inventarioService.inventarioRepository(producto);
			
		} catch (Exception e) {

			response.setSuccessful(false);
			response.setMessage("No se puedo obtener la lista");
		}
		 return listainvetarios;
	}
}




