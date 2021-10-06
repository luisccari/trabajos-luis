import java.util.Scanner;

public class DiaDeLaSemana {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia_de_la_semana;
        System.out.print("Ingresa el valor de dia de la semana: ");
        dia_de_la_semana = in.nextInt();
        in.nextLine();
        if(dia_de_la_semana==1)
            System.out.println("Lunes");
        if(dia_de_la_semana==2)
            System.out.println("Martes");
        if(dia_de_la_semana==3)
            System.out.println("Miercoles");
        if(dia_de_la_semana==4)
            System.out.println("Jueves");
        if(dia_de_la_semana==5)
            System.out.println("Viernes");
        if(dia_de_la_semana==6)
            System.out.println("Sabado");
        if(dia_de_la_semana==7)
            System.out.println("Domingo");
        if(dia_de_la_semana<1||dia_de_la_semana>7)
            System.out.println("Dia no valido");
    }

}