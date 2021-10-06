import java.util.Scanner;

public class SueldoSemanalPor40Horas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double horas_trabajadas, pago_por_hora, sueldo_semanal;
        System.out.print("Ingresa el valor de horas trabajadas: ");
        horas_trabajadas = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de pago por hora: ");
        pago_por_hora = in.nextDouble();
        in.nextLine();
        sueldo_semanal=horas_trabajadas*pago_por_hora;
        if(horas_trabajadas>40)
            sueldo_semanal=sueldo_semanal+(horas_trabajadas-40)*pago_por_hora;
        System.out.println("Valor de sueldo semanal: " + sueldo_semanal);
    }

}