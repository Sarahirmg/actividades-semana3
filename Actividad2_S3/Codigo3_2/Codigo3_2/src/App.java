import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        int []numeros = new int[8];
        int num,i=0;
        do{
           System.out.println("Ingrese un numero entero para el arreglo:");
           num=a.nextInt();
           numeros[i]=num;
           i++;
        }while(i<8);
        System.out.println("El arreglo es:"+ Arrays.toString(numeros));
        
        a.close();
        int mayor = numeros[0]; 
        int menor = numeros[0];
        for (int d = 0; d < numeros.length; d++) {
            if(numeros[d]>mayor){
                mayor = numeros[d];
            } 
        }
        for (int b = 0; b < numeros.length;b++) {
            if(numeros[b]<menor){
                menor = numeros[b];
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);   
    }
}
