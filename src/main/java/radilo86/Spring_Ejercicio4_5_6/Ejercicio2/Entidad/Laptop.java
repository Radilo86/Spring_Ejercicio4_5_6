package radilo86.Spring_Ejercicio4_5_6.Ejercicio2.Entidad;

import javax.persistence.*;

@Entity // Para Spring identifique los beans
@Table(name="laptop")
public class Laptop {

    // Atributos
    @Id // Indicamos que es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Con esto generamos la id automaticamente
    private Long id;
    private String nombre;
    private Integer ram;
    private Boolean so;

    // Constructores
    public Laptop(Long id, String nombre, Integer ram, Boolean so) {
        this.id = id;
        this.nombre = nombre;
        this.ram = ram;
        this.so = so;
    }

    public Laptop() {
    }

    // Get y Set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Boolean getSo() {
        return so;
    }

    public void setSo(Boolean so) {
        this.so = so;
    }

    // Metodos

}
