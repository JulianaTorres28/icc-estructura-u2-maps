package controllers;

import models.Empleado;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
    }

    @Override
    public void crear(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
        System.out.println("Empleado creado: " + empleado);
    }


    @Override
    public void listar() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados.values()) {
                System.out.println(empleado);
            }
        }
    }


    @Override
    public void eliminar(int id) {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado eliminado con ID: " + id);
        } else {
            System.out.println("Empleado no encontrado con ID: " + id);
        }
    }
}
