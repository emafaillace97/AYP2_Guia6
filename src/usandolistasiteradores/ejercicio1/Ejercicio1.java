package usandolistasiteradores.ejercicio1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Cliente implements Comparable<Cliente> {

    private String nombre, apellido, telefono, dni;

    public Cliente(String nombre, String apellido, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public String toString() {
        return String.format("Apellido: %s - Nombre: %s - DNI: %s - Telefono: %s", this.apellido, this.nombre, this.dni, this.telefono);
    }

    @Override
    public int compareTo(Cliente o) {
        if (this.apellido.equals(o.getApellido())) {
            return this.nombre.compareTo(o.getNombre());
        } else {
            return this.apellido.compareTo(o.getApellido());
        }
    }
}


class Empresa {

    private List<Cliente> clientes;

    public Empresa() {
        this.clientes = new ArrayList<>();
    }

    public void agregar(Cliente... clientes) {
        for (Cliente c : clientes) {
            this.clientes.add(c);
        }
    }

    public void ordenar() {
        Collections.sort(this.clientes);
    }

    public void listar() {
        Iterator<Cliente> i = this.clientes.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}

public class Ejercicio1 {

}
