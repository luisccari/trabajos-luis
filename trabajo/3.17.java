import java.util.Scanner;

public class CompraDeUnPaquete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dinero_recibido;
        System.out.print("Ingresa el valor de dinero recibido: ");
        dinero_recibido = in.nextDouble();
        in.nextLine();
        if(dinero_recibido>=50000)
            System.out.println("Paquete A");
        if(dinero_recibido>=20000&&dinero_recibido<50000)
            System.out.println("Paquete B");
        if(dinero_recibido>=10000&&dinero_recibido<20000)
            System.out.println("Paquete C");
        if(dinero_recibido<10000)
            System.out.println("Paquete D");
    }

}