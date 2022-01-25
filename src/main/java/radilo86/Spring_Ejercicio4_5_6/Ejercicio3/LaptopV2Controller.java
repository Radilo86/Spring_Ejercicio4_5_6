package radilo86.Spring_Ejercicio4_5_6.Ejercicio3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Entidad.Laptop;
import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Repository.LaptopRepository;

@RestController
public class LaptopV2Controller {

    // atributo
    LaptopRepository laptopRepository;

    // constructor
    public LaptopV2Controller(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    // metodos

    // Crea un nuevo registro en la base de datos
    @PostMapping("/api/añadir") // procesa la solicitud de publicacion
    public Laptop añadir(@RequestBody Laptop laptop){
        /*
         * La anotación @RequestBody asigna el cuerpo HttpRequest a un objeto
         * de dominio o de transferencia, lo que permite la deserialización
         * automática del cuerpo HttpRequest entrante en un objeto Java.
        */
        return laptopRepository.save(laptop);
    }

    // Busca un registro segun su id

}
