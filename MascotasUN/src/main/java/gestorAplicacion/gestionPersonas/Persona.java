package gestorAplicacion.gestionPersonas;
import gestorAplicacion.gestionVentas.Factura;

import java.util.ArrayList;
import java.util.Date;

public abstract class Persona {
    /* Esta clase se encarga de darle atributos y metodos basicos a las diferentes personas
    que interactuan con nuestra interfas */

   //Atributos (protected para utilizarlos dentro del paquete)
    protected long personaId;
    protected String nombre;
    protected String email;
    protected Date fechaDeNacimiento;
    protected int telefono;
    protected int nroCuentaBancaria;

    //Constructor
    public Persona(long personaId, String nombre, String email, Date fechaDeNacimiento, int telefono, int nroCuentaBancaria){
        this.personaId=personaId;
        this.nombre=nombre;
        this.email=email;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.telefono=telefono;
        this.nroCuentaBancaria=nroCuentaBancaria;
    }
    
    //Sobrecarga de Constructores
    public Persona(long personaId, String nombre, String email, int documento, Date fechaDeNacimiento, int telefono){
        this(personaId,nombre,email,fechaDeNacimiento,telefono,0); 	
    }
    
    
    //getters y setters
    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNroCuentaBancaria(int nroCuentaBancaria) {
        this.nroCuentaBancaria = nroCuentaBancaria;
    }

    abstract void agregarFactura(Factura f);
}
