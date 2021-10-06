import java.util.Scanner;

public class CostoYDescuentoDel101215DeUnArticulo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double costo, descuento, precio;
        System.out.print("Ingresa el valor de precio: ");
        precio = in.nextDouble();
        in.nextLine();
        descuento=0;
        if(precio>=200)
            descuento=precio*0.15;
        if(precio>100&&precio<200)
            descuento=precio*0.12;
        if(precio<100)
            descuento=precio*0.1;
        costo=precio-descuento;
        System.out.println("Valor de costo: " + costo);
        System.out.println("Valor de descuento: " + descuento);
    }

}