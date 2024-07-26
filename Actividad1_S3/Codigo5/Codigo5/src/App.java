import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra:");
        palabra=a.nextLine();
        cambio(palabra);
        a.close();
    }
    public static void cambio(String palabra) {
        String letra, letracambio;
        Scanner b= new Scanner(System.in);
        System.out.println("Ingrese la letra que desea cambiar: ");
        letra=b.nextLine();
        System.out.println("¿Por qué letra desea cambiar la "+ letra + "?");
        letracambio=b.nextLine();
        System.out.println("La palabra con el cambio de letra es: " + palabra.replace(letra, letracambio));
        b.close();
    }
}
