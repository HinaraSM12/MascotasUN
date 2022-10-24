package gestorAplicacion.gestionPersonas;

import gestorAplicacion.gestionVentas.Factura;
import gestorAplicacion.gestionVentas.Mascota;
import gestorAplicacion.gestionVentas.Producto;
import gestorAplicacion.gestionVentas.Tienda;

import java.io.Serializable;
import java.util.ArrayList;


public class Usuario extends Persona implements Serializable {
	/*Esta clase hereda de la clase abstracta persona y se encarga de manejar a los usuarios de la tienda*/

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Serializador Usuarios
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private String direccion;
	private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

	private ArrayList<Factura> compras = new ArrayList<Factura>();

	// Constructor
	public Usuario(long personaId, String nombre, String email, int telefono, CuentaBancaria cuenta, String direccion, ArrayList<Mascota> mascotas) {
		super(personaId, nombre, email, telefono, cuenta);
		this.direccion = direccion;
		this.mascotas = mascotas;
	}
	// Sobrecarga de constructor
	public Usuario(long personaId, String nombre, String email, int telefono, String direccion, ArrayList<Mascota> mascotas) {
		this(personaId, nombre, email, telefono, null, direccion, mascotas);
	}
	
	@Override
	public void agregarFactura(Factura f){
		compras.add(f);
	}

	//getters y setters
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuario.usuarios=usuarios;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}
	
	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public ArrayList<Factura> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Factura> compras) {
		this.compras = compras;
	}

	//metodos
	public void registrarMascota(Mascota mascota) {
		mascotas.add(mascota);
	}

	public static boolean eliminarUsuario(Usuario usuario){
		Usuario.getUsuarios().remove(usuario);
		return true;
	}

	public static Usuario encontrarPersona(long personaId){
		for(Usuario p: usuarios){
			if(p.getPersonaId()== personaId){
				return p;
			}
		}
		return null;
	}
	@Override
	public String toString() {
		return  "~ ID #"+ personaId + "\n"+
				"~ Nombre = " + nombre +"\n"+
				"~ Email = " + email + "\n"+
				"~ Telefono = " +telefono+ "\n"+
				"~ Direccion = " +direccion+ "\n"+
				"~ Mascotas = " +mascotas+ "\n"+
				"~ Compras = " +compras+ "\n";
	}
}
