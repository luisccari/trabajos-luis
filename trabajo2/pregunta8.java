import java.util.Scanner;

public class PagoPorArticulosLFGC {
//declarar variables
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        //datos de entrada
        double costo, descuento, pago_por_todo, precio;
        pago_por_todo = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de precio: ");
            //proceso
            precio = in.nextDouble();
            in.nextLine();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pago_por_todo=pago_por_todo+costo;
            System.out.println("Valor de costo: " + costo);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
        }
        //datos de salida
        System.out.println("Valor de pago por todo: " + pago_por_todo);
    }

}//LFGC