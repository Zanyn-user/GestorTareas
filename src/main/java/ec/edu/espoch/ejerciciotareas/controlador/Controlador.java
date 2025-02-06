
package ec.edu.espoch.ejerciciotareas.controlador;

import ec.edu.espoch.ejerciciotareas.modelo.GestorTareas;
import ec.edu.espoch.ejerciciotareas.vista.AgregarTarea;
import ec.edu.espoch.ejerciciotareas.vista.ListarTareasCompletadas;
import ec.edu.espoch.ejerciciotareas.vista.ListarTareasPendientes;
import ec.edu.espoch.ejerciciotareas.vista.Vista;


public class Controlador {
    
    private AgregarTarea AgregarTarea;
    private ListarTareasCompletadas ListarTareasCompletadas;
    private ListarTareasPendientes ListarTareasPendientes;
    private Vista Vista;
    private GestorTareas GestorTareas;

    public Controlador(AgregarTarea AgregarTarea, ListarTareasCompletadas ListarTareasCompletadas, ListarTareasPendientes ListarTareasPendientes, Vista Vista, GestorTareas GestorTareas) {
        this.AgregarTarea = AgregarTarea;
        this.ListarTareasCompletadas = ListarTareasCompletadas;
        this.ListarTareasPendientes = ListarTareasPendientes;
        this.Vista = Vista;
        this.GestorTareas = GestorTareas;
    }

   public void agregarTarea(){
       String titulo = AgregarTarea.getTitulo();
       String Descripcion = AgregarTarea.getDescripcion();
       boolean Pendiente = AgregarTarea.getPendiente();
       boolean Completada = AgregarTarea.getCompletada();
   }
    
    
}


