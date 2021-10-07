import java.util.Scanner;
public class prueba {

static Scanner in = new Scanner(System.in);

static void promedioLFGC() {
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
//LFGCC



public static void salarioLFGCC(){
        //declaracion de variables
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
  //LFGCC

public static void vacunaLFGCC(){
  //Declarar variables e inicializacion de valores
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
  //LFGCC


public static void menuOpciones(){ 
  int opcionesA=0;
  System.out.println("-------------------------------");
  String msg="Ingrese el Algoritmo que desea Probar 1=promedio,2=salario,3=vacuna,4=calculadora:";
  System.out.println(msg);
  opcionesA=in.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: promedioLFGC();break;
        case 2: salarioLFGCC();break;
        case 3: vacunaLFGCC();break;
        case 4: calculadoraLFGCC();break;
        default:
          System.out.println("El Algoritmo no existe!");
      }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=in.nextInt();        
  }
}

public static void calculadoraLFGCC(){
  //declarar variables 
int operacion;
        double a, b, resultado;
        String tecla_repetir;
        //datos de entrada
        do {
            System.out.print("Ingresa el valor de a: ");
            a = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de b: ");
            b = in.nextDouble();
            in.nextLine();
            System.out.println("Selecciona el valor de operacion.");
            System.out.println("\t1.- Suma");
            System.out.println("\t2.- Resta");
            System.out.println("\t3.- Multiplicacion");
            System.out.println("\t4.- Division");
            System.out.println("\t5.- Potencia");
            System.out.print("\t: ");
            do {
                operacion = in.nextInt();
                in.nextLine();
                if (operacion<1||operacion>5)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } 
            //proceso
            while (operacion<1||operacion>5);
            resultado=0;
            if(operacion==1)
                resultado=a+b;
            if(operacion==2)
                resultado=Math.pow(a,b);
            if(operacion==3)
                resultado=a-b;
            if(operacion==4)
                resultado=a*b;
            if(operacion==5&&b!=0)
                resultado=a/b;
                //datos de salida
            System.out.println("Valor de resultado: " + resultado);
            System.out.println();
            do {
                System.out.print("Deseas repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }
  //LFGCC
public static void main(String[] args) {

menuOpciones();
}
  
} 
