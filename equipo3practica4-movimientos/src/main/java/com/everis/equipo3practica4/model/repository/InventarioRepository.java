package com.everis.equipo3practica4.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo3practica4.model.Inventario;
import com.everis.equipo3practica4.model.Producto;



@Repository
public interface InventarioRepository extends JpaRepository <Inventario, Integer>{

	public List<Inventario> findByProducto(Producto producto);
}
