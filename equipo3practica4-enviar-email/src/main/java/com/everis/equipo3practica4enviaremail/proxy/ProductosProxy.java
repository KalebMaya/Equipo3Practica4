package com.everis.equipo3practica4enviaremail.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="EQUIPO3PRACTICA4-VENTAS")
public interface ProductosProxy {
//	@GetMapping("/pedido/")
//	public List<Pedido> listar();
//	@PostMapping("/pedido/")
//	public Pedido insertaPedido(@RequestBody Pedido pedido);
//	@PostMapping("/productosdelpedido/")
//	public Productosdelpedido insertaProductoPedido(@RequestBody Productosdelpedido productosdelpedido);
}
