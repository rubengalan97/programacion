public class Ejercicio13Tema6 {
  public static void main(String[] args) {
  
    boolean igual = true;
    int lanzamientos = 0;
  
    do {
      int dado1 = (int) (Math.random()*5+1);
      int dado2 = (int) (Math.random()*5+1);
      if (dado1 == dado2) {
        igual = false;
        lanzamientos++;
      }
      lanzamientos++;
    } while (igual != false);
    System.out.print("Se han lanzado " + lanzamientos + " veces.");
  }
}
