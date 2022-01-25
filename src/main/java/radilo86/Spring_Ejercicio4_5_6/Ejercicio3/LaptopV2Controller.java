package radilo86.Spring_Ejercicio4_5_6.Ejercicio3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Entidad.Laptop;
import radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Repository.LaptopRepository;

import java.util.Optional;

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
    @GetMapping("/api/byId/{id}") // Entre los corchetes pasamos el parametro a buscar
    public ResponseEntity<Laptop> encontrarPorID(@PathVariable Long id){
        /*
        * ResponseEntity maneja toda la respuesta HTTP incluyendo el cuerpo, cabecera y códigos de estado
        * permitiéndonos total libertad de configurar la respuesta que queremos que se envié desde nuestros endpoints.
        * Optional<Clase> es un envoltorio, que es necesario puesto que el crud nos devuelve este tipo de dato.
        * una vez declarado e instanciado podemos comprobar si el dato existe o no mediante el metodo .isPresent()
        * y devolveremos un ResponseEntity.ok o .notFound(), en funcion de si existe o no esa id.
        */
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        if (laptopOpt.isPresent()){
            // Devolvemos el ResponseEntity con el estado OK, junto con los valores que contiene esa Id
            return ResponseEntity.ok(laptopOpt.get());
        }
        else{
            // Devolvemos ResponseEntity con el estado no encontrado (404)
            return ResponseEntity.notFound().build();
        }
    }
}
