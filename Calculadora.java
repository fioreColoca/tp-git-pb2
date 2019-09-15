import java.util.Scanner;
  public class MiCalculadora {
    public static void main(String[] args) {
    Integer a;
    Integer b;
    Integer opcion;
    Integer resultado;
      do{
    	  Scanner teclado = newScanner (System.in);
      System.out.println("Ingrese su operación /n 1 para restar /n 2 para sumar /n 3 para dividir /n 4 para multiplicar y /n 0 para salir");
        opcion = teclado.next();
      }while(opcion < 1 && opcion > 4);
      switch (opcion) {
        case 1:
        System.out.println("Ingrese el primer numero");
          a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
          a = teclado.nextInt();
          resultado = a - b;
        break;

        case 2:
        System.out.println("Ingrese el primer numero");
          a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
          a = teclado.next();
          resultado = a + b;
        break;
        case 3:
        System.out.println("Ingrese el primer numero");
          a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
          a = teclado.nextInt();
        resultado = a / b;
        break;
        case 4:
        System.out.println("Ingrese el primer numero");
          a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
          a = teclado.nextInt();
        resultado = a * b;
        break;
      }
      System.out.println("El resultado es " + resultado.toString());
    }
  }
}
