package pojos;
// Generated 27-feb-2015 11:03:57 by Hibernate Tools 4.3.1

/**
 * Ejercicio generated by hbm2java
 */
public class Ejercicio implements java.io.Serializable {

    private Integer id;
    private Lineasejercicio lineasejercicios;
    private String nombre;

    public Ejercicio() {
    }

    public Ejercicio(Lineasejercicio lineasejercicios) {
        this.lineasejercicios = lineasejercicios;
    }

    public Ejercicio(Lineasejercicio lineasejercicios, String nombre) {
        this.lineasejercicios = lineasejercicios;
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lineasejercicio getLineasejercicios() {
        return this.lineasejercicios;
    }

    public void setLineasejercicios(Lineasejercicio lineasejercicios) {
        this.lineasejercicios = lineasejercicios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
