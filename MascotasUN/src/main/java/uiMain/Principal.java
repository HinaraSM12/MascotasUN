package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.gestionPersonas.CuentaBancaria;
import gestorAplicacion.gestionPersonas.Persona;
import gestorAplicacion.gestionPersonas.Proveedor;
import gestorAplicacion.gestionPersonas.Usuario;
import gestorAplicacion.gestionPersonas.Vendedor;
import gestorAplicacion.gestionVentas.Envio;
import gestorAplicacion.gestionVentas.Factura;
import gestorAplicacion.gestionVentas.Mascota;
import gestorAplicacion.gestionVentas.Gato;
import gestorAplicacion.gestionVentas.Perro;
import gestorAplicacion.gestionVentas.Producto;
import gestorAplicacion.gestionVentas.Tienda;

public class Principal {
	
	public static void showMenu(){
	
	// Inicio del programa
	System.out.println("𝗕𝗶𝗲𝗻𝘃𝗲𝗻𝗶𝗱𝗼 𝗮...\n");

	System.out.println("███╗░░░███╗░█████╗░░██████╗░█████╗░░█████╗░████████╗░█████╗░░██████╗░░░░░░██╗░░░██╗███╗░░██╗\n"+
"████╗░████║██╔══██╗██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝░░░░░░██║░░░██║████╗░██║\n"+
"██╔████╔██║███████║╚█████╗░██║░░╚═╝██║░░██║░░░██║░░░███████║╚█████╗░█████╗██║░░░██║██╔██╗██║\n"+
"██║╚██╔╝██║██╔══██║░╚═══██╗██║░░██╗██║░░██║░░░██║░░░██╔══██║░╚═══██╗╚════╝██║░░░██║██║╚████║\n"+
"██║░╚═╝░██║██║░░██║██████╔╝╚█████╔╝╚█████╔╝░░░██║░░░██║░░██║██████╔╝░░░░░░╚██████╔╝██║░╚███║\n"+
"╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═════╝░░╚════╝░░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░░░░░░░░╚═════╝░╚═╝░░╚══╝\n");
    
	System.out.println("				𝕯𝖔𝖓𝖉𝖊 𝖊𝖓𝖈𝖔𝖓𝖙𝖗𝖆𝖗𝖆́𝖘 𝖙𝖔𝖉𝖔 𝖕𝖆𝖗𝖆 𝖙𝖚𝖘 𝖕𝖊𝖑𝖚𝖉𝖔𝖘\n\n");
	System.out.println("¿Qué desea hacer?\n");
    
	/* El vendedor ingresa al programa y selecciona si desea iniciar sesión o salir
	 del programa */
	
    int response = 0; // Se inicializa la variable response
        System.out.println("1. Iniciar sesión");
        System.out.println("0. Salir");

        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());
        
        switch(response){
        case 1:
            inicioSesion();
            break;
        case 0:
            System.out.println("¡Vuelva pronto!");
            break;
        default:
            System.out.println("Por favor seleccione una respuesta correcta");
		   }
	}
	
	/* Menú que muestra el inicio de sesión*/
	
	static void inicioSesion(){
		int error = 0; // Se inicializa la variable response
		do {
		Scanner sc = new Scanner(System.in);
        String Usuario;
        System.out.println("Ingrese el usuario:" );
        Usuario = sc.nextLine();
        String Contrasena;
        System.out.println("Ingresa la contraseña: ");
        Contrasena=sc.nextLine();

        switch(Usuario) {
        case "Juan Pablo Arcila":
            if("holi12".equals(Contrasena)) {
                System.out.println("Bienvenido, Juan Pablo Arcila");
                error = 1;
                menuPrincipal();
                break;
            }
            else {
                System.err.println("Acceso denegado");
                System.exit(0);
            }
        case "Roberto Barrientos":
            if("adios13".equals(Contrasena)) {
                System.out.println("Bienvenido, Roberto Barrientos");
                error = 1;
                menuPrincipal();
                break;
            }
            else {
                System.err.println("Acceso denegado");
                System.exit(0);
            }
        case "Laura Vanegas":
            if("lau1245".equals(Contrasena)) {
                System.out.println("Bienvenido, Laura Vanegas");
                error = 1;
                menuPrincipal();
                break;
            }
            else {
                System.err.println("Acceso denegado");
                System.exit(0);
            }
        default: {
            System.err.println("No se reconoce el usuario"); //Devolver
            System.exit(0);
        	}
        }
		} while(error != 1);
    }
	
	/* Acceso al menú de funcionalidades */
	
	static void menuPrincipal() {
		System.out.println("¿Qué quieres hacer?");
		System.exit(0);
	}
}