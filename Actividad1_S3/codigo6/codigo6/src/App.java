import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero=a.nextInt();
        raizcuadrada(numero);
        a.close();
    }
    public static void raizcuadrada(int numero) {
        System.out.println("La raiz cuadrada de "+ numero+" es: "+  Math.sqrt(numero));
    }
}
