package com.everis.equipo3practica4enviaremail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo3practica4enviaremail.service.EmailService;

@RestController
public class EnviarNotificacionesController {
	
//	@Autowired
//	private ProductosProxy productosProxy;
	
	@Autowired
	private EmailService servicioEmail;

//	@GetMapping("/pedido/")
//	public List<Pedido> checar() {
//		return productosProxy.listar();
//	}
	
	@PostMapping("/enviacorreo/")
	public boolean enviaremail() {
		servicioEmail.enviarCorreoHTML("vkaleb7@hotmail.com", "Academia-Everis-Examen1", "<h1>Ya esta mi examen profe</h1>");
		return true;
	}
	
//	@PostMapping("/pedido/idproductos/{idproductos}")
//	public String convert(@PathVariable String idproductos, @RequestBody Pedido pedido) {
//		Pedido pedidoinsertado = productosProxy.insertaPedido(pedido);
//		String[] listaproductos = idproductos.split(",");
//		String respuesta = "";
//		for (String idproducto : listaproductos) {
//				Integer.parseInt(idproducto);
//				Productosdelpedido productosdelpedido = new Productosdelpedido();
//				Producto producto = new Producto();
//				producto.setId(Integer.parseInt(idproducto));
//				productosdelpedido.setPedido(pedidoinsertado);
//				productosdelpedido.setProducto(producto);
//				respuesta += "producto: " + productosProxy.insertaProductoPedido(productosdelpedido).getProducto().getNombre() + "\n";
//			}
//			try {
//			if(tiponotificacion.equals("whatsapp") || tiponotificacion.equals("ambas")) {
//				MensajeCliente mensaje = new MensajeCliente();
//				mensaje.setMensaje(respuesta);
//				mensaje.setNumero(whatsappdestino);
//				UbicacionCliente ubicacion = new UbicacionCliente();
//				ubicacion.setDireccion("Casa de " + pedidoinsertado.getCliente().getNombre());
//				ubicacion.setLatitud(pedidoinsertado.getCliente().getLatitud());
//				ubicacion.setLongitud(pedidoinsertado.getCliente().getLongitud());
//				ubicacion.setNumero(whatsappdestino);
//				whatsappProxy.enviarmensaje(whatzmeapitoken, mensaje);
//				whatsappProxy.enviarubicacion(whatzmeapitoken, ubicacion);
//			}if(tiponotificacion.equals("email") || tiponotificacion.equals("ambas")) {
//				servicioEmail.enviarCorreo(emaildestino, "Productos comprados", respuesta);
//			}
//			return respuesta;
//		} catch (Exception e) {
//			return e.getMessage();
//		}
//	}
	

}
