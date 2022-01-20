import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) throws NumeroNegativoExcepcion {
        Scanner leer = new Scanner(System.in);
        System.out.println("Teclea el numero que deseas evaluar: ");
        double num=0,resultado=0;
        try {
            num = leer.nextDouble();
        }catch (Exception e){
            System.out.println("El dato ingresado no es un valor numerico");
            System.exit(0);
        }
        try {
            if (num < 0) {
                throw new NumeroNegativoExcepcion("El numero es negativo, no tiene raiz cuadrada");
            } else {
                resultado=Math.sqrt(num);
                System.out.println("La raiz cuadrada de "+num+" es: "+resultado);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class NumeroNegativoExcepcion extends Exception{
      public NumeroNegativoExcepcion(){}
      public NumeroNegativoExcepcion(String Error){
          super(Error);
      }
}
