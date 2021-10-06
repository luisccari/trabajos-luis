import java.util.Scanner;

public class BonoMensualPorAntiguedadOPorSueldo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double antiguedad, bono_mensual, bono_por_antiguedad, bono_por_sueldo, sueldo;
        System.out.print("Ingresa el valor de antiguedad: ");
        antiguedad = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de sueldo: ");
        sueldo = in.nextDouble();
        in.nextLine();
        bono_por_antiguedad=0;
        if(antiguedad>2&&antiguedad<5)
            bono_por_antiguedad=sueldo*0.2;
        if(antiguedad>=5)
            bono_por_antiguedad=sueldo*0.3;
        bono_por_sueldo=0;
        if(sueldo<=1000)
            bono_por_sueldo=sueldo*0.25;
        if(sueldo>1000&&sueldo<=3500)
            bono_por_sueldo=sueldo*0.15;
        if(sueldo>3500)
            bono_por_sueldo=sueldo*0.1;
        if(bono_por_antiguedad>bono_por_sueldo)
            bono_mensual=bono_por_antiguedad;
        else
            bono_mensual=bono_por_sueldo;
        System.out.println("Valor de bono mensual: " + bono_mensual);
        System.out.println("Valor de bono por antiguedad: " + bono_por_antiguedad);
        System.out.println("Valor de bono por sueldo: " + bono_por_sueldo);
    }

}