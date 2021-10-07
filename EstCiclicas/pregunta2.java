import java.util.Scanner;

public class BonoPorDesempenpLFGCC {
//Declaracion de variables
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bono, puntos, salario_minimo;
        //Datos de entrada
        System.out.print("Ingresa el valor de puntos: ");
        puntos = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de salario minimo: ");
        salario_minimo = in.nextDouble();
        in.nextLine();
        //Proceso
        bono=0;
        if(puntos<=100)
            bono=salario_minimo;
        if(puntos>100&&puntos<=200)
            bono=salario_minimo*.10;
        if(puntos>200&&puntos<=300)
            bono=salario_minimo*.40;
        if(puntos>300&&puntos<=400)
            bono=salario_minimo*.70;
        if(puntos>400)
            bono=salario_minimo*.80;
            //Datos de salida
        System.out.println("Valor de bono: " + bono);
        System.out.println("Valor de puntos obtenidos son: " + puntos);
    }

}