public class Ejercicio5Tema6 {
  public static void main(String[] args) {
  
    int max = 100;
    int min = 199;
    int suma = 0;
  
    for (int i = 0; i < 50; i++) {
        int numero = (int) (Math.random()*99+100);
        
        if (numero > max) {
          max = numero;
        }
        
        if (numero < min) {
          min = numero;
        }
        suma +=numero;
    }
    System.out.println("El valor máximo es: " + max);
    System.out.println("El valor mínimo es: " + min);
    System.out.println("La media de todos los números es: " + (suma/50));
  }
}
