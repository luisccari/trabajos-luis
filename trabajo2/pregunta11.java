import java.util.Scanner;

public class FuncionExponencialLFGC {
//declarar variables
    public static void main(String[] args) {
        int i, n;
        //datos de entrada
        double ex, factorial, x;
        ex = 0;
        factorial = 0;
        System.out.print("Ingresa el valor de x: ");
        x = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        //proceso
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            if(i==1)
            {
                ex=1;
                factorial=1;
            }
            factorial=factorial*i;
            ex=ex+Math.pow(x,i)/factorial;
            System.out.println();
        }
        //datos de salida
        System.out.println("Valor de ex: " + ex);
        System.out.println("Valor de factorial: " + factorial);
    }

}//LFGC