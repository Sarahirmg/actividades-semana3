import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner a= new Scanner(System.in);
       int i, num;
       int []numeros= new int[6];
       for(i=0; i<6; i++){
         System.out.println("Ingrese el numero:" );
         num=a.nextInt();
         numeros[i]=num;
       }
       System.out.println("El arreglo de forma normal es: "+ Arrays.toString(numeros));
       int []invertido= new int [numeros.length];
       for (int d = 0; d< numeros.length; d++) {
         invertido[d] = numeros[numeros.length -1-d];
       }
       System.out.println("Array invertido:" + Arrays.toString(invertido));
       a.close();
    } 
       
}
