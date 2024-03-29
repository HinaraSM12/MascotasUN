/*Esta clase se encarga de editar los productos preexistentes y devolver el toString() del
* producto editado*/

package uiMain.gestion.gestionProductos;

import gestorAplicacion.gestionVentas.Producto;
import gestorAplicacion.gestionVentas.Tienda;

import java.util.Scanner;

public class EditarProducto {
    private static int id;

    public static void editarProducto() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Para editar el producto ingrese el codigo de registro del mismo: ");
            id = input.nextInt();
            Producto producto=Tienda.encontrarProducto(id); //buscar producto por id
            if (producto == null) {
                System.out.println("Ese producto no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Producto encontrado! \n"+ producto);
                input = new Scanner(System.in);
                int opcion;
                do {
                    System.out.println("Edicion del producto");
                    System.out.println("1. Editar solo el nombre del producto");
                    System.out.println("2. Editar solo el precio de venta");
                    System.out.println("3. Editar solo la cantidad de productos comprados");
                    System.out.println("4. Editar todos los parametros de producto");
                    System.out.println("5. Regresar");
                    opcion= input.nextInt();
                    switch (opcion){ //Case dependiendo de lo que se quiera editar
                        case 1:
                            System.out.println("Ingrese el nuevo nombre del producto: ");
                            producto.setNombre(input.next());
                            System.out.println(producto.toString());//Se imprime la instancia de producto con los atributos modificados
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo precio de venta");
                            producto.setPrecioVenta(input.nextInt());
                            System.out.println(producto.toString());//Se imprime la instancia de producto con los atributos modificados
                            break;
                        case 3:
                            System.out.println("Ingrese el nueva cantidad de productos comprados");
                            producto.setCantidadComprada(input.nextInt());
                            System.out.println(producto.toString());//Se imprime la instancia de producto con los atributos modificados
                            break;
                        case 4:
                            System.out.println("Ingrese el nuevo nombre del producto: ");
                            String nombre= input.next();
                            System.out.println("Ingrese el nuevo precio de venta");
                            int precio= input.nextInt();
                            System.out.println("Ingrese el nueva cantidad de productos comprados");
                            int cantComprados= input.nextInt();
                            producto.editarProducto(id,nombre,precio,cantComprados);
                            System.out.println(producto.toString()); //Se imprime la instancia de producto con los atributos modificados
                            break;
                        case 5:
                            break;
                    }
                } while (opcion != 5);
            }
        }
    }
}