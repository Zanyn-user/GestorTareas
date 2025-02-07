
package ec.edu.espoch.ejerciciotareas.modelo;

public class Tarea {
    
 private int id;
    private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String titulo, String descripcion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int tarea) {
        this.id = tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }   
    
    
}
