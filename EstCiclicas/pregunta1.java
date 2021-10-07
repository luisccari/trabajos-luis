import java.util.Scanner;

public class promedioLFGCC {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //definir variables
        double primer_examen, promedio, segundo_examen, tercer_examen;
        //datos de entrada
        System.out.print("Ingresa el valor de primer examen: ");
        primer_examen = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de segundo examen: ");
        segundo_examen = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de tercer examen: ");
        tercer_examen = in.nextDouble();
        in.nextLine();
        //proceso
        promedio=primer_examen*0.25+segundo_examen*0.25+tercer_examen*0.5;
        //datos de salida
        System.out.println("Valor de promedio: " + promedio);
    }

}//LFGCC
