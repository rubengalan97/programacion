public class Ejercicio5Tema4 {
  public static void main(String[] args) {
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    
    System.out.print("Introduce un valor para la a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce un valor para la b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) {
      System.out.println("No tiene solución real");
    } else {
        System.out.println("La solución de la ecuación es: x = " + (-b/a));
    }
  }
}
