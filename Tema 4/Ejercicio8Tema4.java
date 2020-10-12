public class Ejercicio8Tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce nota del primer examen: ");
    int nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce nota del segundo examen: ");
    int nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce nota del tercer examen: ");
    int nota3 = Integer.parseInt(System.console().readLine());
    
    int media = (nota1 + nota2 + nota3)/3;
    
    if (media < 5) {
      System.out.print("Tienes un insuficiente");
    }
    if ((media >= 5) && (media <6)) {
      System.out.print("Tienes un suficiente");
    }
     if ((media >= 6) && (media <7)) {
      System.out.print("Tienes un bien");
    }
     if ((media >= 7) && (media <9)) {
      System.out.print("Tienes un notable");
    }
     if ((media >= 9) && (media <=10)) {
      System.out.print("Tienes un sobresaliente");
    }
    
  }
}
