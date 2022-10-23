package uiMain;
import java.util.ArrayList;
import java.util.HashMap;

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

//Pendiente: ¿Tienda lleva constructor?. Y revisar el cantidad_Comprada

public class CasosPrueba {
	
	public static void crearCasosDePrueba() {
	
	// Cuentas bancarias
		// Cuentas de clientes
	CuentaBancaria cuenta1 = new CuentaBancaria((long)108952347, (float)2023456.1, 1852);
	CuentaBancaria cuenta2 = new CuentaBancaria((long)278782778, (float)800.5, 8728);
	CuentaBancaria cuenta3 = new CuentaBancaria((long)387787222, (float)500456.7, 7885);
	
		// Cuenta bancaria del proveedor
	CuentaBancaria cuentaProveedor = new CuentaBancaria((long)1089523479, (float)20858967.8, 5782);
		
		// Cuenta bancaria de la tienda
	CuentaBancaria cuentaTienda = new CuentaBancaria((long)1077774562, (float)10889456.6, 1023);
	
	// Productos
		// Perro grande adulto
	Producto producto1 = new Producto(1, "Croquetas Adulto Plus", "13/04/2023", "Comida en croquetas para perro adulto de raza grande", 5000, 12000, 2);
	Producto producto2 = new Producto(2, "Comida húmeda Adulto Max", "28/12/2022", "Comida húmeda para perro adulto de raza grande", 2000, 5000, 3);
	Producto producto3 = new Producto(3, "Cuido Adulto Extra", "18/05/2023", "Comida diaria para perro adulto de raza grande", 9000, 15000, 4);
		
		// Perro grande cachorro
	Producto producto4 = new Producto(4, "Croquetas Cachorro Plus", "18/05/2023", "Comida en croquetas para perro cachorro de raza grande", 5000, 12000, 4);
	Producto producto5 = new Producto(5, "Comida húmeda Cachorro Max", "29/11/2022", "Comida húmeda para perro cachorro de raza grande", 2000, 5000, 2);
	Producto producto6 = new Producto(6, "Cuido Cachorro Extra", "17/04/2023", "Comida diaria para perro cachorro de raza grande", 9000, 15000, 3);
		
		// Perro pequeño adulto
	Producto producto7 = new Producto(7, "Croquetas Adulto Mini", "30/08/2023", "Comida en croquetas para perro adulto de raza pequeña", 6000, 13000, 2);
	Producto producto8 = new Producto(8, "Comida húmeda Adulto Junior", "18/12/2022", "Comida húmeda para perro adulto de raza pequeña", 3000, 6000, 3);
	Producto producto9 = new Producto(9, "Cuido Adulto Small", "14/01/2023", "Comida diaria para perro adulto de raza pequeña", 10000, 16000, 4);
		
		// Perro pequeño cachorro
	Producto producto10 = new Producto(10, "Croquetas Cachorro Mini", "29/08/2023", "Comida en croquetas para perro cachorro de raza pequeña", 6000, 13000, 5);
	Producto producto11 = new Producto(11, "Comida húmeda Cachorro Junior", "17/12/2022", "Comida húmeda para perro cachorro de raza pequeña", 3000, 6000, 3);
	Producto producto12 = new Producto(12, "Cuido Cachorro Small", "13/01/2023", "Comida diaria para perro cachorro de raza pequeña", 10000, 16000, 2);
		
		// Gato cachorro
	Producto producto13 = new Producto(13, "Purina catchow cachorro", "19/01/2024", "Comida seca para gato cachorro", 7000, 10000, 7);
	Producto producto14 = new Producto(14, "Comida enlatada felino cachorro", "29/05/2024", "Comida húmeda para gato cachorro", 5000, 9000, 2);
	Producto producto15 = new Producto(15, "Whiskas para felino cachorro", "09/08/2024", "Alimento balanceado para gato cachorro", 11000, 15000, 1);
		
		// Gato adulto
	Producto producto16 = new Producto(16, "Purina catchow adulto", "18/01/2024", "Comida seca para gato adulto", 7000, 10000, 2);
	Producto producto17 = new Producto(17, "Comida enlatada felino adulto", "28/05/2024", "Comida húmeda para gato adulto", 5000, 9000, 3);
	Producto producto18 = new Producto(18, "Whiskas para felino adulto", "01/09/2024", "Alimento balanceado para gato adulto", 11000, 15000, 4);
	
	//ArrayList de productos
	ArrayList<Producto> listaProductos = new ArrayList<Producto>(); listaProductos.add(producto1); listaProductos.add(producto2);listaProductos.add(producto3); listaProductos.add(producto4);
	listaProductos.add(producto5); listaProductos.add(producto6); listaProductos.add(producto7); listaProductos.add(producto8); listaProductos.add(producto9); listaProductos.add(producto10);
	listaProductos.add(producto11); listaProductos.add(producto12); listaProductos.add(producto13); listaProductos.add(producto14); listaProductos.add(producto15); listaProductos.add(producto16);
	listaProductos.add(producto17); listaProductos.add(producto18);
	
	//HashMap de productos
		//Compras usuario1
	HashMap<Producto, Integer> compra1 =new HashMap<Producto, Integer>(); compra1.put(producto4, 2); compra1.put(producto5, 2); compra1.put(producto6, 3); compra1.put(producto13, 4); 
	compra1.put(producto14, 2); compra1.put(producto15, 1);	
	HashMap<Producto, Integer> compra2 =new HashMap<Producto, Integer>(); compra2.put(producto4, 2); compra2.put(producto13, 3);
	
		//Compra usuario2
	HashMap<Producto, Integer> compra3 =new HashMap<Producto, Integer>(); compra3.put(producto16, 2); compra3.put(producto17, 2); compra3.put(producto18, 3);
	HashMap<Producto, Integer> compra4 =new HashMap<Producto, Integer>(); compra4.put(producto17, 1);
	
		//Compra usuario3
	HashMap<Producto, Integer> compra5 =new HashMap<Producto, Integer>(); compra5.put(producto1, 2); compra5.put(producto2, 3); compra5.put(producto3, 3);
	HashMap<Producto, Integer> compra6 =new HashMap<Producto, Integer>(); compra6.put(producto3, 1);
	
		//Compra usuario4
	HashMap<Producto, Integer> compra7 =new HashMap<Producto, Integer>(); compra7.put(producto7, 2); compra7.put(producto8, 2); compra7.put(producto9, 3); compra7.put(producto10, 3); 
	compra7.put(producto11, 2); compra7.put(producto12, 1);
	HashMap<Producto, Integer> compra8 =new HashMap<Producto, Integer>(); compra8.put(producto8, 1); compra8.put(producto9, 1); compra8.put(producto10, 2); compra8.put(producto11, 1); 
	compra8.put(producto12, 1);

	// Mascotas
			// Perros
		Perro perro1 = new Perro(100, "Dante", 1, "Grande"); //Perro Cachorro Grande
		Perro perro2 = new Perro(101, "Tony", 5, "Grande"); //Perro Adulto Grande
		Perro perro3 = new Perro(102, "Apolo", 8, "Pequeño"); //Perro Adulto Pequeño
		Perro perro4 = new Perro(103, "Lupita", 0, "Pequeño"); //Perro Cachorro pequeño
		
			// Gatos
		Gato gato1 = new Gato(123, "Jackie", 1); //Gato Cachorro
		Gato gato2 = new Gato(124, "Manchita", 4); //Gato Adulto 
		
		// ArrayList de mascotas
		ArrayList<Mascota> listaMascotas1 = new ArrayList<Mascota>(); listaMascotas1.add(perro1); listaMascotas1.add(gato1);
		ArrayList<Mascota> listaMascotas2 = new ArrayList<Mascota>(); listaMascotas2.add(gato2);
		ArrayList<Mascota> listaMascotas3 = new ArrayList<Mascota>(); listaMascotas3.add(perro2);
		ArrayList<Mascota> listaMascotas4 = new ArrayList<Mascota>(); listaMascotas4.add(perro3); listaMascotas1.add(perro4);
		
	
	// Proveedor
	Proveedor proveedor1 = new Proveedor(43825896, "Pedro Casas", "pcasas@email.com", 4484250, cuentaProveedor, listaProductos, true) ;
	
	// Clientes
	Usuario usuario1 = new Usuario(1093186721, "Manuela Arboleda", "manuarbol@email.com", 4422879, cuenta1, "Cra 170 # 2-103", listaMascotas1); //Usuario 1 tiene Perro Cachorro Grande y Gato Cachorro
	Usuario usuario2 = new Usuario(35164789, "Valentina Higuita", "vhiguita@email.com", 3728945, cuenta2, "Cra 58 # 78-29", listaMascotas2); //Usuario 2 tiene Gato Adulto
	Usuario usuario3 = new Usuario(25787278, "Jorge Sierra", "jsierra@email.com", 7895589, cuenta3, "Cll 66 # 43-47", listaMascotas3); //Usuario 3 tiene Perro Adulto Grande
	Usuario usuario4 = new Usuario(1027278278, "Manuela Arboleda", "manuarbol@email.com", 4422879, "Cll 48 # 63-102", listaMascotas4); // Usuario 4 tiene Perro Adulto Pequeño y Perro Cachorro Pequeño
	
	// Vendedores
		Vendedor vendedor1 = new Vendedor(46785214, "Juan Pablo Arcila", "jpardilla@email.com", 4478514, new ArrayList<Factura>(), "Juan Pablo Arcila", "holi12");
		Vendedor vendedor2 = new Vendedor(13205481, "Roberto Barrientos", "rbarriendo@email.com", 4905873, new ArrayList<Factura>(), "Roberto Barrientos", "adios13");
		Vendedor vendedor3 = new Vendedor(119258647, "Laura Vanegas", "lavanega@email.com", 3158647, new ArrayList<Factura>(), "Laura Vanegas", "lau1245");
	
	// Facturas
		Factura factura1 = new Factura(usuario1, "23/10/2022", vendedor1);
		factura1.setProductos(compra1);
		Factura factura2 = new Factura(usuario1, "15/10/2022", vendedor1);
		factura2.setProductos(compra2);
		
		Factura factura3 = new Factura(usuario2, "22/10/2022", vendedor2);
		factura3.setProductos(compra3);
		Factura factura4 = new Factura(usuario2, "21/10/2022", vendedor2);
		factura4.setProductos(compra4);
		
		Factura factura5 = new Factura(usuario3, "19/10/2022", vendedor3);
		factura5.setProductos(compra5);
		Factura factura6 = new Factura(usuario3, "18/10/2022", vendedor3);
		factura6.setProductos(compra6);
		
		Factura factura7 = new Factura(usuario4, "17/10/2022", vendedor3);
		factura7.setProductos(compra7);
		Factura factura8 = new Factura(usuario4, "16/10/2022", vendedor3);
		factura8.setProductos(compra8);
	
	
	//ArrayList de facturas
		ArrayList<Factura> listaFactura1 = new ArrayList<Factura>(); listaFactura1.add(factura1); listaFactura1.add(factura2);
		ArrayList<Factura> listaFactura2 = new ArrayList<Factura>(); listaFactura1.add(factura3); listaFactura1.add(factura4);
		ArrayList<Factura> listaFactura3 = new ArrayList<Factura>(); listaFactura1.add(factura5); listaFactura1.add(factura6); listaFactura1.add(factura7); listaFactura1.add(factura8);
	
	
	}
	
}