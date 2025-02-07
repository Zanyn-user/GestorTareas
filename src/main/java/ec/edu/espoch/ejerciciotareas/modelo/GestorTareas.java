package ec.edu.espoch.ejerciciotareas.modelo;

import ec.edu.espoch.ejerciciotareas.controlador.Controlador;

public class GestorTareas {

    private Controlador controlador;
    Tarea[] tareas = new Tarea[4];
    Tarea[] tareasAux= new Tarea[4];

    public GestorTareas(Controlador controlador) {
        this.controlador = controlador;
    }

    public void agregarTarea(Tarea tarea) {
        
        tareas[0].setId(tarea.getId());
        tareas[0].setTitulo(tarea.getTitulo());
        tareas[0].setCompletada(tarea.getCompletada());
        
    }

    public Tarea[] listarTareasPendientes() {

        for(int i=0;i>3;i++){
            if(!tareas[i].getCompletada()){
                tareasAux[i]=tareas[i];
            }
        }
        
        return tareasAux;
    }

    public  Tarea[] listarTareasCompletadas() {
        for(int i=0;i>3;i++){
            if(tareas[i].getCompletada()){
                tareasAux[i]=tareas[i];
            }
        }
        return tareasAux;
    }

    public String marcarCompletada() {

        return "";

    }

}
