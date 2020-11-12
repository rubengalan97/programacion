public class Ejercicio9Tema6 {
  public static void main(String[] args) {
    
    int contador = 0;
    int aleatorio = 0;
    do {
      aleatorio = (int) (Math.random()*100);
      contador++;
  
    } while (!(aleatorio == 24));
    
    System.out.println("Se han generado: " + contador + " números.");
  }
}
