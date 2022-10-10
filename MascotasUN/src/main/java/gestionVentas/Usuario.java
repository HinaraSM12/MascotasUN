package gestionVentas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario extends Persona {
	private String formaPago;
	private String direccion;
	private String envioCompra;
	private int saldoCliente;
	private boolean esPremium;
	private List<Mascota> mascotas = new ArrayList<Mascota>();

	//constructor
	public Usuario(int personaId, String nombre, String email, int documento, Date fechaDeNacimiento, int telefono, int nroCuentaBancaria, String formaPago, String direccion, String envioCompra, int saldoCliente, boolean esPremium, List<Mascota> mascotas) {
		super(personaId, nombre, email, documento, fechaDeNacimiento, telefono, nroCuentaBancaria);
		this.formaPago = formaPago;
		this.direccion = direccion;
		this.envioCompra = envioCompra;
		this.saldoCliente = saldoCliente;
		this.esPremium = esPremium;
		this.mascotas = mascotas;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEnvioCompra() {
		return envioCompra;
	}
	
	public void setEnvioCompra(String envioCompra) {
		this.envioCompra = envioCompra;
	}
	
	public int getSaldoCliente() {
		return saldoCliente;
	}
	
	public void setSaldoCliente(int saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	
	public boolean isEsPremium() {
		return esPremium;
	}
	
	public void setEsPremium(boolean esPremium) {
		this.esPremium = esPremium;
	}
	
	public List<Mascota> getMascotas() {
		return mascotas;
	}
	
	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	//metodos
	
	public void registrarMascota(Mascota mascota) {
		mascotas.add(mascota);
	}
	
	public void eliminarMascota {}
}