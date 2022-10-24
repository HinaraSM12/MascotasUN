package uiMain.gestion.gestionUsuarios;

import java.util.Scanner;

public class GestionUsuarios {
    private static int opcion;
    public static void GestionarUsuarios() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Estas a punto de gestionar tus productos");
            System.out.println("¿Que deseas hacer?");
            System.out.println(" 1. Ver productos");
            System.out.println(" 2. Agregar nuevo producto");
            System.out.println(" 3. Eliminar producto");
            System.out.println(" 4. Regresar");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: ; VerUsuario.verUsuario(); break;
                case 2: ; AgregarUsuario.agregarUsuario(); break;
                case 3: ; EliminarUsuario.eliminarProducto(); break;
                case 5: break;
            }
        } while (opcion != 4);
    }
}
