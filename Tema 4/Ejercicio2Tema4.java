public class Ejercicio2Tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias");
    }
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
    if ((hora >= 21) && (hora < 24) || (hora <=5) && (hora >= 0)) {
      System.out.println("Buenas noches");
    }
  }
}
