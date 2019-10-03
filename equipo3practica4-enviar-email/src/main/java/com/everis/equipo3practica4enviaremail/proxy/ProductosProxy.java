package com.everis.equipo1examen3enviarnotificaciones.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.equipo1examen3enviarnotificaciones.model.Pedido;
import com.everis.equipo1examen3enviarnotificaciones.model.Productosdelpedido;

@FeignClient(name="productos-proxy", url="http://192.168.5.66:8000")
public interface ProductosProxy {
	@GetMapping("/pedido/")
	public List<Pedido> listar();
	@PostMapping("/pedido/")
	public Pedido insertaPedido(@RequestBody Pedido pedido);
	@PostMapping("/productosdelpedido/")
	public Productosdelpedido insertaProductoPedido(@RequestBody Productosdelpedido productosdelpedido);
}
