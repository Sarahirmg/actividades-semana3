import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String palabra;
        Scanner a=new Scanner(System.in);
        System.out.println("Ingrese su palabra:");
        palabra=a.nextLine();
        mayusculas(palabra);
        a.close();
    }
    public static void mayusculas(String palabra) {
        Scanner b=new Scanner(System.in);
        while(!palabra.equals(" ")){
            System.out.println(palabra.toUpperCase());
            if(!palabra.equals(" ")){
               System.out.println("Ingrese su palabra: ");
               palabra=b.nextLine();
            }else{
                break;
            }
            
        }
        System.out.println("Se ha terminado la ejecución, hasta luego!!");
        b.close();

    }
}
