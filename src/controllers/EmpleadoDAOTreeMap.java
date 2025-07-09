package controllers;

import models.Empleado;

import java.util.Map;
import java.util.TreeMap;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
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
