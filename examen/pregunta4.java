import java.util.Scanner;

public class CalculadoraQueSumaRestaMultiplicaYDivide {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operacion;
        double a, b, resultado;
        String tecla_repetir;
        do {
            System.out.print("Ingresa el valor de a: ");
            a = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de b: ");
            b = in.nextDouble();
            in.nextLine();
            System.out.println("Selecciona el valor de operacion.");
            System.out.println("\t1.- Suma");
            System.out.println("\t2.- Resta");
            System.out.println("\t3.- Multiplicacion");
            System.out.println("\t4.- Division");
            System.out.print("\t: ");
            do {
                operacion = in.nextInt();
                in.nextLine();
                if (operacion<1||operacion>4)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (operacion<1||operacion>4);
            resultado=0;
            if(operacion==1)
                resultado=a+b;
            if(operacion==2)
                resultado=a-b;
            if(operacion==3)
                resultado=a*b;
            if(operacion==4&&b!=0)
                resultado=a/b;
            System.out.println("Valor de resultado: " + resultado);
            System.out.println();
            do {
                System.out.print("Deseas repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }

}