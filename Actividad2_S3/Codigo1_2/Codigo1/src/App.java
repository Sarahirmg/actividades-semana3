import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        int num,i,cpar=0, cimpar=0;
        int []numeros=new int[10];
        for(i=0; i<10; i++){
        System.out.println("Ingresa el número: ");
        num=a.nextInt();
        numeros[i]=num;
        if(numeros[i]%2==0){
            cpar+=1;
        }else{
            cimpar+=1;
        }
        }
        System.out.println("La cantidad de numeros pares en el arreglo "+ Arrays.toString(numeros)+ "es:"+cpar);
        System.out.println("La cantidad de numeros impares en el arreglo "+  Arrays.toString(numeros)+ "es:"+cimpar);
        a.close();


    }
}
