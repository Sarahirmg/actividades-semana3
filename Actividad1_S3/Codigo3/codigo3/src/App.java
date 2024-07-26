import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese un texto(una palabra):");
        palabra=a.nextLine();
        identificar(palabra);
        a.close();
    }
    public static void identificar(String pal){
        String invertida="",palabra;
        palabra=pal;
        for (int i =pal.length()-1; i >=0; i--) {
            invertida=invertida+pal.charAt(i);
         }
        if(palabra.equals(invertida)){
            System.out.println("La palabra es palindroma");
            
        }else{
            System.out.println("La palabra ingresada no es palindroma");
        }
    }
}
