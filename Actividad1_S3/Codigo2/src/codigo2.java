import java.util.Scanner;
public class codigo2 {
    public static void main(String[] args) throws Exception {
        int num1,num2;
        Scanner a=new Scanner(System.in);
        System.out.println("ingrese los numeros de los cuales desea generar el minimo comun multiplo");
        System.out.print("");
        System.out.println("Ingrese el primer numero:");
        num1=a.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2=a.nextInt();
        minimo_comun_multiplo(num1, num2);
        a.close();
        
    }
    public static void minimo_comun_multiplo(int num1,int num2){
        int contador=2, minimocm=1;
        while(num1>=contador|| num2>=contador){
            if(num1%contador==0 || num2%contador==0){
               if(num1%contador==0){
                num1=num1/contador;
               }
               if(num2%contador==0){
                num2=num2/contador;
               }
               minimocm=minimocm*contador;
            }else{
                contador+=1;
            }           
        }
           System.out.println("El minimo cumun multiplo es:"+minimocm); 
            
    }
}
