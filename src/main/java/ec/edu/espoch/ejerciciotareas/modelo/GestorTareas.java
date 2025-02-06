
package ec.edu.espoch.ejerciciotareas.modelo;

public class GestorTareas extends Tarea{

public GestorTareas(int id, String titulo, String descripcion, boolean completada) {
        super(id, titulo, descripcion, completada);
    }

    
    
    public String agregarTarea (Tarea tarea){
        String [] Tarea = new String[3];
        Tarea[0] = Integer.toString(tarea.getId()) ;
        Tarea [1] = tarea.getTitulo();
        Tarea [2] = tarea.getDescripcion();
        return "";
    }
    
    public String listarTareasPendientes (){
        
        return "";
    }
    
    public String listarTareasCompletadas(){
        
        return "";
    }
    
    public String marcarCompletada(){
        
        return "";
        
    }
    
}

