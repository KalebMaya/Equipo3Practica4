package com.everis.equipo3practica4enviaremail.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo3practica4enviaremail.model.Inventario;
import com.everis.equipo3practica4enviaremail.model.Producto;
import com.everis.equipo3practica4enviaremail.proxy.ProductosProxy;
import com.everis.equipo3practica4enviaremail.response.InventarioResponse;
import com.everis.equipo3practica4enviaremail.service.EmailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api (value= "REST servicio para enviar correo")
public class EnviarNotificacionesController {
	
	@Autowired
	private ProductosProxy productosProxy;
	
	@Autowired
	private EmailService servicioEmail;
	
	@ApiOperation("Listar productos")
	@GetMapping("/producto/")
	public List<Producto> checar() {
		return productosProxy.listarProducto();
	}
	
	@ApiOperation("Listar movimientos de un producto")
	@GetMapping("/inventario/{id}")
	public InventarioResponse buscar(@PathVariable int id){
		InventarioResponse respuesta = new InventarioResponse();
		respuesta.setLista(productosProxy.consulta(id));
		respuesta.setMessage("Exito");
		int total = 0;
		for (Inventario inventario : respuesta.getLista()) {
			total += inventario.getCantidad();
		}
		respuesta.setTotal(total);
		respuesta.setValue(null);
		respuesta.setSuccessful(true);
		return respuesta;
	}
	
	@ApiOperation("Listar movimientos de un producto")
	@PostMapping("/entrada-salida/producto/{idproducto}/entrada/{cantidad}")
	public InventarioResponse insertarPedido(@PathVariable int idproducto, @PathVariable int cantidad){
		InventarioResponse respuesta = productosProxy.insertar(idproducto, cantidad);
		respuesta.setLista(null);
		respuesta.setTotal(cantidad);
		return respuesta;
	}
	
	@ApiOperation("Enviar correo")
	@PostMapping("/producto/")
	public boolean enviaremail(@RequestBody Producto producto) {
		productosProxy.registrarProducto(producto);
//		servicioEmail.enviarCorreoHTML("vkaleb7@hotmail.com", "Academia-Everis-Examen1", 
//				producto.getNombre() + "\n" + producto.getDescripcion() + "\n" 
//				+ "<image src=\" + producto.getImagen() + "/>");
		servicioEmail.enviarCorreoHTML("vkaleb7@hotmail.com", producto.getNombre(),
				"<img src=\"" + producto.getImagen() + "\"><br>" + producto.getDescripcion());
		return true;
	}

}
