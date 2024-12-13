package entities;

public class Agente {
    private int id;
    private String nombre;
    private String habilidad;
    private int nivel;  

    
    public Agente(int id, String nombre, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.nivel = 1;  
    }

    
    public void incrementarNivel() {
        this.nivel++;
    }

    
    public int getNivel() {
        return nivel;
    }

    
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Habilidad: " + habilidad + ", Nivel: " + nivel;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
