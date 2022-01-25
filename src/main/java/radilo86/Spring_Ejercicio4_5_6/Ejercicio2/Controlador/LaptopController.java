package radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Controlador;

import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Entidad.Laptop;
import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Veremos los metodos de la API en JSON mediante el navegador o Postman
public class LaptopController {

    /* Necesitamos acceder a los metodos del repositorio, que es el que implementa el CRUD
    * para ello crearemos un atributo del tipo LaptopRepository para acceder a sus metodos
    * crud y un constructor al que pasaremos el atributo recien creado para que
    * no nos de error la clase. Una vez hecho esto podremos obtener sus resultados
    * llamando a este atributo. */
    // Atributo
    LaptopRepository laptopRepository;

    // Constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // Metodos
    @GetMapping("/api/all")
    public List<Laptop> todos(){
        return laptopRepository.findAll();
    }



}
