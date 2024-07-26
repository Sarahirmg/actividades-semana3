import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        int num,i=0,resultado=0;
        int []suma=new int[5];
        do{
            System.out.println("Ingrese un número:");
            num=a.nextInt();
            suma[i]=num;
            resultado+=num;
            i++;
        }while(i<5);
        System.out.println("La suma de los numeros que integran el arreglo "+Arrays.toString(suma)+ " es: "+ resultado);
        a.close();
    }
}
