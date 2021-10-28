import java.util.Scanner;

public class CantidadesCeroMenoresYMayores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantidades_cero, i, mayores_a_cero, menores_a_cero, n;
        double cantidad;
        cantidades_cero = 0;
        menores_a_cero = 0;
        mayores_a_cero = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de cantidad: ");
            cantidad = in.nextDouble();
            in.nextLine();
            if(cantidad==0)
                cantidades_cero=cantidades_cero+1;
            if(cantidad<0)
                menores_a_cero=menores_a_cero+1;
            if(cantidad>0)
                mayores_a_cero=mayores_a_cero+1;
            System.out.println();
        }
        System.out.println("Valor de cantidades cero: " + cantidades_cero);
        System.out.println("Valor de menores a cero: " + menores_a_cero);
        System.out.println("Valor de mayores a cero: " + mayores_a_cero);
    }

}