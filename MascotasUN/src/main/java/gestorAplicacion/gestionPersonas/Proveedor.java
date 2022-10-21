package gestorAplicacion.gestionPersonas;

import gestorAplicacion.gestionVentas.Producto;

import java.util.ArrayList;
import java.util.Date;

public class Proveedor extends Persona {
    //Serializador Proveedores
    private static ArrayList<Proveedor> proveedores = new ArrayList<>();
    //Atributos
    private ArrayList<Producto> producto=new ArrayList<Producto>();
    private boolean stock;
    //Constructor
    public Proveedor(int personaId, String nombre, String email, int documento, Date fechaDeNacimiento, int telefono, int nroCuentaBancaria, ArrayList<Producto> producto, boolean stock) {
        super(personaId, nombre, email, documento, fechaDeNacimiento, telefono, nroCuentaBancaria);
        this.producto = producto;
        this.stock = stock;
    }
    //Getters y setters
    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }


    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    @Override
    public void agregarCuentaBancaria() {

    }

    @Override
    public void eliminarCuentaBancaria() {

    }
}