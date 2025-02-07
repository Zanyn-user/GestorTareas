package ec.edu.espoch.ejerciciotareas.controlador;

import ec.edu.espoch.ejerciciotareas.modelo.GestorTareas;
import ec.edu.espoch.ejerciciotareas.modelo.Tarea;
import ec.edu.espoch.ejerciciotareas.vista.AgregarTarea;
import ec.edu.espoch.ejerciciotareas.vista.ListarTareasCompletadas;
import ec.edu.espoch.ejerciciotareas.vista.ListarTareasPendientes;
import ec.edu.espoch.ejerciciotareas.vista.Vista;

public class Controlador {

    private AgregarTarea AgregarTarea;
    private ListarTareasCompletadas ListarTareasCompletadas;
    private ListarTareasPendientes ListarTareasPendientes;
    private Vista Vista;
    private GestorTareas gestorTareas;
    private Tarea tareas;

    public Controlador(AgregarTarea AgregarTarea, ListarTareasCompletadas ListarTareasCompletadas, ListarTareasPendientes ListarTareasPendientes, Vista Vista, GestorTareas GestorTareas) {
        this.AgregarTarea = AgregarTarea;
        this.ListarTareasCompletadas = ListarTareasCompletadas;
        this.ListarTareasPendientes = ListarTareasPendientes;
        this.Vista = Vista;
        this.gestorTareas = GestorTareas;
    }

    public void agregarTarea() {

        try {

            String titulo = AgregarTarea.getTitulo();
            String descripcion = AgregarTarea.getDescripcion();
            boolean estadoTarea = AgregarTarea.getPendiente();

            tareas.setTitulo(titulo);
            tareas.setDescripcion(descripcion);
            tareas.setCompletada(estadoTarea);
            
            gestorTareas.agregarTarea(tareas);
            
            
        } catch (Exception e) {
        }

    }

}
