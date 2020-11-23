public class Ejercicio11Tema7 {
  public static void main(String[] args) {
  
    //Declaracion de variables y arrays
  
    int numero;
    int [] lista = new int [10];
    int [] primo = new int [10];
    int [] noPrimo = new int [10];
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    for (int i = 0; i < 10; i++) { //Introducir valores dentro del array
      System.out.print("Introduce un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      lista[i] = numero;
      esPrimo = true;
        for (int j =2; j < lista[i]-1; j++) { //Comprobar si el numero es primo
          if (lista[i] % j == 0) {
            esPrimo = false;
          }
        }
        if (esPrimo) { //Si es primo lo mete en otra array
          primo[primos++] = lista[i];
        } else { //Si no lo es lo mete en otro array
          noPrimo[noPrimos++] = lista[i];
        }
    }
    System.out.println("Original");
    for (int i = 0; i < 10; i++) { //Para mostrar el array original
      System.out.print(lista[i] + " ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Los primos delante");
    
    for (int i = 0; i < 10; i++) { //Introducir los valores primos primero
      lista[i] = primo[i];
    }
    for (int i = primos; i < primos + noPrimos; i++) { //Los no primos detras
      lista[i] = noPrimo[i - primos];
    }
    for (int i = 0; i < 10; i++) { //Mostrar el array con los valores cambiados
      System.out.print(lista[i] + " ");
    }
  }
}
