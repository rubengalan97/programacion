public class Ejercicio6Tema6 {
  public static void main(String[] args) {
    
    int adivino;
    int contador = 5;
    int aleatorio = (int) (Math.random()*101);
        
    do {
      System.out.print("Introduce un número entre 0-100: ");
      adivino = Integer.parseInt(System.console().readLine());
      
      if (adivino > aleatorio) {
        System.out.println("El número que has introducido es mayor que el número a adivinar");
        contador--;
        System.out.println("Te quedan " + contador + " intentos.");
      }
      if (adivino < aleatorio) {
        System.out.println("El número que has introducido es menor que el número a adivinar");
        contador--;
        System.out.println("Te quedan " + contador + " intentos.");
      }
    } while (!(adivino == aleatorio || contador == 0));
    
    System.out.print("El número era: " + aleatorio);
  }
}
