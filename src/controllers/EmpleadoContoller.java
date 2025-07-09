package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public void crearEmpleado(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
        System.out.println("Empleado creado: " + empleado);
    }

    public Empleado buscarEmpleado(int id) {
        return empleados.get(id);
    }

    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados.values()) {
                System.out.println(empleado);
            }
        }
    }

    public boolean actualizarEmpleado(int id, Empleado empleadoActualizado) {
        if (empleados.containsKey(id)) {
            empleados.put(id, empleadoActualizado);
            System.out.println("Empleado actualizado: " + empleadoActualizado);
            return true;
        }
        System.out.println("Empleado no encontrado con ID: " + id);
        return false;
    }

    public boolean eliminarEmpleado(int id) {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado eliminado con ID: " + id);
            return true;
        }
        System.out.println("Empleado no encontrado con ID: " + id);
        return false;
    }
}
