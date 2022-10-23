package uiMain.funcionalidades;
import gestorAplicacion.gestionPersonas.*;
import gestorAplicacion.gestionVentas.*;
import uiMain.CasosPrueba;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.Date;
public class RealizarVenta {
    static  Tienda t= new Tienda();

    //Mostrar productos disponibles
    public static Scanner input = new Scanner(System.in);
    public static  void funcionalidad() throws ParseException {
        int opcion;
        int opcion2;
        do {
            System.out.println("Realizar una compra");
            System.out.println(" 1. Mostrar productos disponibles");
            System.out.println(" 2. agregar productos a la compra");
            System.out.println(" 3. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    obtenerProductos(t);
                    break;
                case 2:
                    do{
                        System.out.println("Agregar a la compra");
                        System.out.println(" 1. Agregar un nuevo producto");
                        System.out.println(" 2. Eliminar un producto");
                        System.out.println(" 3. Mostrar resumen de factura");
                        System.out.println(" 4. Finalizar compra");
                        System.out.println(" 5. volver al menu compra");
                        System.out.print("Indique su eleccion : ");
                        opcion2 = input.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("Ingrese 1 para un usuario registrado y 0 para agregar uno nuevo");
                                int us= input.nextInt();
                                switch (us){
                                    case 1:
                                        System.out.println("Ingrese la fecha en formado: dd/mm/yyyy ");
                                        String f=input.next();
                                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                        Date fecha = sdf.parse(f);
                                        System.out.println("Ingrese el metodo de pago: \n 1 en caso de efectivo 0 en caso de tarjeta");
                                        int metodo= input.nextInt();
                                        String metodoPago= "";
                                        switch (metodo){
                                            case 1:
                                                metodoPago= "efectivo";
                                                break;
                                            case 2:
                                                metodoPago= "tarjeta";
                                                break;
                                        }
                                        Factura factura=new Factura(Usuario.getUsuarios().get(0), fecha, metodoPago,Vendedor.getVendedores().get(0));
                                        break;
                                    case 0:



                                }

                        }
                    }
                    }
            }

        }

    public static void obtenerProductos(Tienda tienda) {
        for (Map.Entry<Producto, Integer> fact : tienda.getInventario().entrySet()) {
            Producto k = fact.getKey();
            Integer v = fact.getValue();
            System.out.println("~ " + k.toString() + "\n" + "Tiene " + v + " unidades disponibles\n");

        }


    }
}

