import java.util.Scanner;

public class FabricaDeFocos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int color, focos_blancos, focos_rojos, focos_verdes, i;
        int n;
        focos_verdes = 0;
        focos_blancos = 0;
        focos_rojos = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Selecciona el valor de color.");
            System.out.println("\t1.- verde");
            System.out.println("\t2.- blanco");
            System.out.println("\t3.- rojo");
            System.out.print("\t: ");
            do {
                color = in.nextInt();
                in.nextLine();
                if (color<1||color>3)
                    System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
            } while (color<1||color>3);
            if(color==1)
                focos_verdes=focos_verdes+1;
            if(color==2)
                focos_blancos=focos_blancos+1;
            if(color==3)
                focos_rojos=focos_rojos+1;
            System.out.println();
        }
        System.out.println("Valor de focos verdes: " + focos_verdes);
        System.out.println("Valor de focos blancos: " + focos_blancos);
        System.out.println("Valor de focos rojos: " + focos_rojos);
    }

}