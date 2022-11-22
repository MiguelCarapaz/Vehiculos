import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Vehiculos[] re=new Vehiculos[5];
        for(int i = 0; i < re.length; i++){
            re[i] = new Vehiculos();
        }
        int opcion=0;
        boolean exit=false;
        Scanner leer = new Scanner(System.in);
        while(!exit){
            System.out.println("1.- Ingresar datos de Vehiculos");
            System.out.println("2.- Mostar datos de Vehiculos");
            System.out.println("3.- Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    for(int i=0; i< re.length;i++){
                        System.out.println("VEHICULO "+ (i+1));
                        re[i].vehiculos();
                    }
                    break;
                case 2:
                    for(int i=0; i< re.length;i++){
                        System.out.println("VEHICULO "+ (i+1));
                        re[i].mostrar_datos();
                    }
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