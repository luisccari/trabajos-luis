import java.util.Scanner;

public class ClienteDeUnBancoLFGC {
//declarar variables
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        //datos de entrada
        double cantidad_01_enero, cantidad_02_febrero, cantidad_03_marzo, cantidad_04_abril, cantidad_05_mayo;
        double cantidad_06_junio, cantidad_07_julio, cantidad_08_agosto, cantidad_09_septiembre, cantidad_10_octubre;
        double cantidad_11_noviembre, cantidad_12_diciembre, intereses, inversion_final, total;
        total = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print(" Ingresa el valor de cantidad 01 enero: ");
            cantidad_01_enero = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 02 febrero: ");
            cantidad_02_febrero = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 03 marzo: ");
            cantidad_03_marzo = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 04 abril: ");
            cantidad_04_abril = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 05 mayo: ");
            cantidad_05_mayo = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 06 junio: ");
            cantidad_06_junio = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 07 julio: ");
            cantidad_07_julio = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 08 agosto: ");
            cantidad_08_agosto = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 09 septiembre: ");
            cantidad_09_septiembre = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 10 octubre: ");
            cantidad_10_octubre = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 11 noviembre: ");
            cantidad_11_noviembre = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de cantidad 12 diciembre: ");
            cantidad_12_diciembre = in.nextDouble();
            in.nextLine();
            //proceso
            intereses=total*0.1;
            total=total+intereses+cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre;
            inversion_final=total;
            //datos de salida
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de inversion final: " + inversion_final);
            System.out.println();
        }
        System.out.println("Valor de total: " + total);
    }

}//LFGC