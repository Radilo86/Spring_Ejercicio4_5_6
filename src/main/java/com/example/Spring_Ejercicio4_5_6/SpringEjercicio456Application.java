package com.example.Spring_Ejercicio4_5_6;

import com.example.Spring_Ejercicio4_5_6.Ejercicio2.Entidad.Laptop;
import com.example.Spring_Ejercicio4_5_6.Ejercicio2.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEjercicio456Application {

	public static void main(String[] args) {

		// Iniciamos la clase con el autoescaneo de beans
		ApplicationContext context = SpringApplication.run(SpringEjercicio456Application.class,args);
		// Le asignamos a la variable repositorio los metodos de la clase LaptopRepository
		LaptopRepository repositorio = context.getBean(LaptopRepository.class);

		// Creamos 3 objetos de tipo laptop con sus valores inicializados
		Laptop pc1 = new Laptop(null,"Mac",512,true);
		Laptop pc2 = new Laptop(null,"Windows",1024,true);
		Laptop pc3 = new Laptop(null,"Generico",256,false);

		// Guardamos los valores de laptop mediante el metodo CRUD save en nuestra DB H2.
		repositorio.save(pc1);
		repositorio.save(pc2);
		repositorio.save(pc3);

	}

}
