import java.util.Scanner;

public class TotalesDeNVentas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, ventas_de_0_a_10000, ventas_de_10000_a_20000;
        double monto_global, monto_ventas_de_0_a_10000, monto_ventas_de_10000_a_20000, venta;
        ventas_de_0_a_10000 = 0;
        ventas_de_10000_a_20000 = 0;
        monto_ventas_de_0_a_10000 = 0;
        monto_ventas_de_10000_a_20000 = 0;
        monto_global = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de venta: ");
            venta = in.nextDouble();
            in.nextLine();
            if(venta<=10000)
            {
                ventas_de_0_a_10000=ventas_de_0_a_10000+1;
                monto_ventas_de_0_a_10000=monto_ventas_de_0_a_10000+venta;
            }
            if(venta>10000&&venta<=20000)
            {
                ventas_de_10000_a_20000=ventas_de_10000_a_20000+1;
                monto_ventas_de_10000_a_20000=monto_ventas_de_10000_a_20000+venta;
            }
            monto_global=monto_global+venta;
            System.out.println();
        }
        System.out.println("Valor de ventas de 0 a 10000: " + ventas_de_0_a_10000);
        System.out.println("Valor de ventas de 10000 a 20000: " + ventas_de_10000_a_20000);
        System.out.println("Valor de monto ventas de 0 a 10000: " + monto_ventas_de_0_a_10000);
        System.out.println("Valor de monto ventas de 10000 a 20000: " + monto_ventas_de_10000_a_20000);
        System.out.println("Valor de monto global: " + monto_global);
    }

}