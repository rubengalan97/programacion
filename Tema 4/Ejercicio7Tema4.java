public class Ejercicio7Tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce nota del primer examen: ");
    int nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce nota del segundo examen: ");
    int nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce nota del tercer examen: ");
    int nota3 = Integer.parseInt(System.console().readLine());
    
    int media = (nota1 + nota2 + nota3)/3;
    
    System.out.print("La nota media de los 3 examenes es de: " + media);
    
  }
}
