public class Ejercicio4Tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el número de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40) {
      System.out.println("El sueldo es de: " + (horas * 12) + "€");
    } else {
      System.out.println("El sueldo es de: " + ((40 * 12) + ((horas - 40) * 16)) + "€");
    }
  }
}
