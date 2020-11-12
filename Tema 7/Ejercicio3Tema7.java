public class Ejercicio3Tema7 {
  public static void main(String[] args) {
  
    int [] aleatorios = new int[10];
    int numero;
  
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      aleatorios[i] = numero;
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.print(aleatorios[i] + " ");
    }
  }
}
