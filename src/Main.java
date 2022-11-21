import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion=0;
        boolean exit=false;
        Scanner leer = new Scanner(System.in);
        Vehiculos vehiculo1 = new Vehiculos();
        Vehiculos vehiculo2 = new Vehiculos();
        Vehiculos vehiculo3 = new Vehiculos();
        Vehiculos vehiculo4 = new Vehiculos();
        Vehiculos vehiculo5 = new Vehiculos();

        while(!exit){
            System.out.println("1.- Ingresar datos de Vehiculos");
            System.out.println("2.- Mostar datos de Vehiculos");
            System.out.println("3.- Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    vehiculo1.vehiculo1();
                    vehiculo2.vehiculo2();
                    vehiculo3.vehiculo3();
                    vehiculo4.vehiculo4();
                    vehiculo5.Vehiculo5();
                    break;
                case 2:
                    vehiculo1.mostrar_datos();
                    vehiculo2.mostrar_datos();
                    vehiculo3.mostrar_datos();
                    vehiculo4.mostrar_datos();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese un numero que este en el rango de 1 - 3");
            }
        }
    }
}