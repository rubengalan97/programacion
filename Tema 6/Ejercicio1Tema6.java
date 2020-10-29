public class Ejercicio1Tema6 {
  public static void main(String[] args) {
    
    int suma = 0;
    
    for (int i = 1; i<=3; i++) {
      
      //Para generar un numero aleatorio entre 1 y 6
      
      int dado = (int) (Math.random()*6)+1;
      System.out.println("El lanzamiento de el dado " + i + " es: " + dado);
      suma = suma + dado;
    }
    System.out.println("");
    System.out.print("La suma de los 3 dados es: " + suma);
  }
}
