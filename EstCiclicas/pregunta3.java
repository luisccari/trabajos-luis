import java.util.Scanner;

public class VacunaLFGCC {
//declarar variables
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad, sexo;
        //datos de entrada
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextInt();
        in.nextLine();
        //proceso
        System.out.println("Selecciona el valor de sexo.");
        System.out.println("\t1.- mujer");
        System.out.println("\t2.- hombre");
        System.out.print("\t: ");
        do {
            sexo = in.nextInt();
            in.nextLine();
            if (sexo<1||sexo>2)
                System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
        } 
        //datos de salida
        while (sexo<1||sexo>2);
        if((sexo==2&&edad>=16&&edad<70)||edad<16)
            System.out.println("A");
        if(sexo==1&&edad>=16&&edad<70)
            System.out.println("B");
        if(edad>70)
            System.out.println("C");
    }

}