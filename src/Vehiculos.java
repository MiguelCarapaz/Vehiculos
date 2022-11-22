import java.util.Scanner;
public class Vehiculos {
    String marca, placa, tipo;
    int anio ;
    public Vehiculos(){
        marca="";
        placa="";
        tipo ="";
        anio = 0;
    }
    public void vehiculos() {
        Scanner leer = new Scanner(System.in);
        Vehiculos Vehiculos = new Vehiculos();
        System.out.print("Ingrese la marca: ");
        marca = leer.nextLine();
        System.out.print("Ingrese el tipo de vehiculo: ");
        tipo = leer.nextLine();
        System.out.print("Ingrese la placa: ");
        placa = leer.nextLine();
        System.out.print("Ingrese el anio: ");
        anio = leer.nextInt();
        System.out.println("------------------------------");
    }
    public void mostrar_datos(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Anio: " + getAnio());
        System.out.println("------------------------------");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
