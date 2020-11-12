public class Ejercicio5Tema7 {
  public static void main(String[] args) {
  
    int numero;
    int maximo = 0;
    int minimo = 0;
    int [] numbers = new int[10];
  
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      numbers[i] = numero;
      maximo = numbers[0];
      minimo = numbers[0];
      if (maximo < numbers[i]) {
        maximo = numbers[i];
      }
      if (minimo > numbers[i]) {
        minimo = numbers[i];
      }
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) {
      System.out.print(numbers[i]);
      if (numbers[i] == maximo) {
        System.out.print(" maximo");
      }
      if (numbers[i] == minimo) {
        System.out.print(" minimo");
      }
      System.out.println("");
    }
  }
}
