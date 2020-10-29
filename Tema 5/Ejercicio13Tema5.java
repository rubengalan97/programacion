//Rubén Galán Pérez

public class Ejercicio13Tema5 {
  public static void main(String[] args) {
    
    String positivo = "";
    String negativo = "";
    int x;
    
    for (int i = 1; i<=10; i++){

      System.out.print("Introduce un número: ");
      x = Integer.parseInt(System.console().readLine());
      
      if (x<0){
        
        negativo = negativo + " " + x;
        
      } else {
        
        positivo = positivo + " " + x;
        
      }
      
    }
    
    System.out.println("");
    System.out.println("Los numeros positivos introducidos son: " + positivo);
    System.out.println("Los numeros negativos introducidos son: " + negativo);
    
  }
}
