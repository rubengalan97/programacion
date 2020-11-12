public class Ejercicio19Tema6 {
  public static void main(String[] args) {
  
    int mayorPar = -100;
    int menorImpar = 200;
    int suma = 0;
  
    for (int i = 0; i < 50; i++) {
      
      int aleatorio = (int) ((Math.random()*301)-100);
      
      if (aleatorio > mayorPar && aleatorio % 2 == 0) {
        mayorPar = aleatorio;
      }
      if (aleatorio < menorImpar && aleatorio % 2 != 0) {
        menorImpar = aleatorio;
      }
      suma = suma + aleatorio;
    }
    System.out.println("El menor impar es: " + menorImpar);
    System.out.println("El mayor par es: " + mayorPar);
    System.out.println("La media es: " + (suma/50));
  }
}
