package com.everis.equipo3practica4.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo3practica4.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
