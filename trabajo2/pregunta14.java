import java.util.Scanner;

public class AprobadosYReprobadosLFGC {
//declarar variables
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //datos de entrada
        int aprobados, i, n, reprobados;
        double calificacion, calificacion_aprobatoria;
        aprobados = 0;
        reprobados = 0;
        System.out.print("Ingresa el valor de calificacion aprobatoria: ");
        calificacion_aprobatoria = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        //proceso
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de calificacion: ");
            calificacion = in.nextDouble();
            in.nextLine();
            if(calificacion>=calificacion_aprobatoria)
                aprobados=aprobados+1;
            else
                reprobados=reprobados+1;
            System.out.println();
        }
        //datos de salida
        System.out.println("Valor de aprobados: " + aprobados);
        System.out.println("Valor de reprobados: " + reprobados);
    }

}//LFGC