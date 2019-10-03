package com.everis.equipo3practica4enviaremail.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.equipo3practica4enviaremail.model.Inventario;
import com.everis.equipo3practica4enviaremail.model.Producto;
import com.everis.equipo3practica4enviaremail.response.InventarioResponse;

@FeignClient(name="CONFIG")
public interface ProductosProxy {
	@GetMapping("/productos/")
	public List<Producto> listarProducto();
	@PostMapping("/productos/")
	public Producto registrarProducto(@RequestBody Producto producto);
	@GetMapping("/movimientos/{id}")
	public List<Inventario> consulta(@PathVariable int id);
	@PostMapping("/movimientos/entrada-salida/producto/{idproducto}/entrada/{cantidad}")
	public InventarioResponse insertar(@PathVariable int idproducto, @PathVariable int cantidad);
//	@PostMapping("/productosdelpedido/")
//	public Productosdelpedido insertaProductoPedido(@RequestBody Productosdelpedido productosdelpedido);
}
