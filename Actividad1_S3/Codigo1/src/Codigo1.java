import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = a.nextInt();

        numprimo(num);
        
        a.close();
    }

    public static void numprimo(int num) {
        if (num <= 1) {
            System.out.println(false);
        }else if(num==2){
            System.out.println(true);
        }
        else if (num % 2 == 0) {
            System.out.println( false);
        }else{
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                System.out.println(false);
            }
        }System.out.println(true);}
        
    }
}   