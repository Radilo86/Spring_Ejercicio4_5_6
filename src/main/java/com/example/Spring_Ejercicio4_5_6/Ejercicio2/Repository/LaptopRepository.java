package com.example.Spring_Ejercicio4_5_6.Ejercicio2.Repository;

import com.example.Spring_Ejercicio4_5_6.Ejercicio2.Entidad.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// El interface hereda de la clase JpaRepository que nos implementa el Crud y le pasaremos
// la clase y el tipo de dato de la id
@Repository // Le indicamos que esto es el repositorio
public interface LaptopRepository extends JpaRepository<Laptop,Long>{
}
