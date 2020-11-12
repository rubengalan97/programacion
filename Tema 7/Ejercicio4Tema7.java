public class Ejercicio4Tema7 {
  public static void main(String[] args) {
  
    int [] numero = new int[20];
    int [] cuadrado = new int[20];
    int [] cubo = new int[20];
  
    for (int i = 0; i < 20; i++) {
      int aleatorio = (int) (Math.random()*101);
      numero[i] = aleatorio;
      cuadrado[i] = aleatorio*aleatorio;
      cubo[i] = aleatorio*aleatorio*aleatorio;
      System.out.println("El numero es: " + numero[i] + " , el cuadrado es: " + cuadrado[i] + " , el cubo es: " + cubo[i]);
    }
  }
}
