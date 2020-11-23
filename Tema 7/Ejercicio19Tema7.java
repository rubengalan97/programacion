public class Ejercicio19Tema7 {
  public static void main(String[] args) {
    
    //Declaracion de variables
    
    int [] lista = new int [12];
    int numero;
    int posicion;
    
    for (int i = 0; i < 12; i++) { //Introducir valores en el array
      lista[i] = (int)(Math.random()*201);
    }
    System.out.println("Original: ");
    for (int i = 0; i < 12; i++) { //Mostrar el array
      System.out.print(lista[i] + " ");
    }
    System.out.println("");
    System.out.print("Introduce el valor que quieres introducir: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indica en que posicion lo quieres introducir (0-11): ");
    posicion = Integer.parseInt(System.console().readLine());
    
    System.out.println("Resultado: ");
    for (int i = lista.length-1; i > posicion; i--) {
      lista[i] = lista[i-1]; //Mover 1 a la derecha los valores
    }
    lista[posicion] = numero;
    for (int i = 0; i < 12; i++) { //Mostrar el array
      System.out.print(lista[i] + " ");
    }
  }
}
