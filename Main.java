import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Nacional> listaProductosNac = new ArrayList<>();
        ArrayList<Importado> listaProductosIm = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto Nacional");
            System.out.println("2. Agregar producto Importado");
            System.out.println("3. Ver productos Nacionales");
            System.out.println("4. Ver productos Importados");
            System.out.println("5. Buscar productos Nacionales");
            System.out.println("6. Buscar productos Importados");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("");
                System.out.println("Ingrese los datos para el producto nacional:");
                System.out.print("Nombre: ");
                String nombreNac = scanner.next();
                System.out.print("Código: ");
                int codigoNac = scanner.nextInt();
                System.out.print("Registro DIAN: ");
                String registroDianNac = scanner.next();

                Nacional nacional = new Nacional(nombreNac, codigoNac, registroDianNac);
                listaProductosNac.add(nacional);

            } else if (opcion == 2) {
                System.out.println("Ingrese los datos para el producto importado:");
                System.out.print("Nombre: ");
                String nombreIm = scanner.next();
                System.out.print("Código: ");
                int codigoIm = scanner.nextInt();
                System.out.print("Licencia Importación: ");
                String licenciaImportacionIm = scanner.next();

                Importado importado = new Importado(nombreIm, codigoIm, licenciaImportacionIm);
                listaProductosIm.add(importado);

            } else if (opcion == 3) {
                System.out.println("Información de productos nacionales:");
                for (Nacional nacional : listaProductosNac) {
                    System.out.println("Nombre: " + nacional.getNombre() + ", Código: " + nacional.getCodigo() + ", Registro DIAN: " + nacional.registroDian);
                }
            } else if (opcion == 4) {
                System.out.println("Información de productos importados:");
                for (Importado importado : listaProductosIm) {
                    System.out.println("Nombre: " + importado.getNombre() + ", Código: " + importado.getCodigo() + ", Licencia Importación: " + importado.licenciaImportacion);
                }
            } else if (opcion == 5) {

                System.out.println("Escribe el nombre del producto: ");
                String busProducto = scanner.next(); 

                for (Nacional nacional : listaProductosNac) {
                    if (nacional.getNombre().equals(busProducto)) {
                        System.out.println("Nombre: " + nacional.getNombre() + ", Código: " + nacional.getCodigo() + ", Registro DIAN: " + nacional.registroDian); 
                    }else {
                        System.out.println("Ese producto no existe");
                    }
                }

            } else if (opcion == 6) {

                System.out.println("Escribe el nombre del producto: ");
                String busProducto = scanner.next(); 

                for (Importado importado : listaProductosIm) {
                    if (importado.getNombre().equals(busProducto)) {
                        System.out.println("Nombre: " + importado.getNombre() + ", Código: " + importado.getCodigo() + ", Registro DIAN: " + importado.licenciaImportacion);
                        
                    } else {
                    System.out.println("Ese producto no existe");
                }
            }

            } else if (opcion == 7) {
                System.out.println("Saliendo del programa.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
