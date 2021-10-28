import java.util.Scanner;

public class TotalDeUnaCajaRegistradora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int billetes_de_100, billetes_de_1000, billetes_de_20, billetes_de_200, billetes_de_50;
        int billetes_de_500, monedas_de_1, monedas_de_10, monedas_de_2, monedas_de_20;
        int monedas_de_5, total;
        System.out.print("Ingresa el valor de billetes de 100: ");
        billetes_de_100 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 1000: ");
        billetes_de_1000 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetes_de_20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 200: ");
        billetes_de_200 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetes_de_50 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 500: ");
        billetes_de_500 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 1: ");
        monedas_de_1 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 10: ");
        monedas_de_10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        monedas_de_2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 20: ");
        monedas_de_20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedas_de_5 = in.nextInt();
        in.nextLine();
        total=billetes_de_1000*1000+billetes_de_500*500+billetes_de_200*200+billetes_de_100*100+billetes_de_50*50+billetes_de_20*20+monedas_de_20*20+monedas_de_10*10+monedas_de_5*5+monedas_de_2*2+monedas_de_1;
        System.out.println("Valor de total: " + total);
    }

}