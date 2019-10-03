package com.everis.equipo3practica4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.everis.equipo3practica4.model.Producto;
import com.everis.equipo3practica4.model.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Value("${config.descuento1}")
	private int descuento1;
	
	@Value("${config.descuento2}")
	private int descuento2;
	
	@Value("${config.descuento3}")
	private int descuento3;
	
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.findAll();
	}
	
	public Producto insertar(Producto producto) {
		double precio = producto.getPrecio();
//		si los precios del producto son entre: 0 - 1000 se aplica descuento1, 
		int descuentoAplicado = 0;
		if(precio < 1001 ) {
			descuentoAplicado = descuento1;
		}
//		si son entre 1001 - 5000 se aplica descuento2
		if(precio >1000 && precio < 5001) {
			descuentoAplicado = descuento2;
		}
//		si el precio del producto es  > 5001  el descuento3
		if(precio > 5000) {
			descuentoAplicado = descuento3;
		}
		double precioConDescuento = precio - (precio*descuentoAplicado/100);
		producto.setPrecio(precioConDescuento);
		return productoRepository.save(producto);
	}
	
	public Producto buscarId(int id) {
		return productoRepository.findById(id).get();
	}
	
}
