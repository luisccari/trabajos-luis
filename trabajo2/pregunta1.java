import java.util.Scanner;

public class IncrementoAlSalarioDeUnProfesorLFGC {
//declaracion de variables
    public static void main(String[] args) {
        int i;
        //datos de entrada
        double salario_inicial, salario_recibido, year;
        //proceso
        for (i=1; i<=6; i++) {
            System.out.print("PROCESO " + i);
            salario_inicial=1500;
            year=i;
            salario_recibido=salario_inicial*Math.pow(1.1,year);
            //datos de salida
            System.out.println(" Valor de salario inicial: " + salario_inicial);
            System.out.println(" Valor de salario recibido: " + salario_recibido);
            System.out.println(" Valor de año: " + year);
            System.out.println();
        }
    }

}//LFGC