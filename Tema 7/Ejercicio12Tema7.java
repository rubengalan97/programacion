public class Ejercicio12Tema7 {
  public static void main(String[] args) {
    
    //Duda en este ejercicio cuando meto inicio 1 y fin 9
    //Declaracion de variables
    
    int numero;
    int inicio;
    int fin;
    boolean comprobar = false;
    int [] lista = new int [10];
    int [] resul = new int [10];
    
    for (int i = 0; i < 10; i++) { //Introducir valores dentro del array
      System.out.print("Introduce un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      lista[i] = numero;
    }
    System.out.println("");
    do{ //Para comprobar lo que pide el ejercicio
      comprobar = true;
      
      System.out.print("Introduce inicio: ");
      inicio = Integer.parseInt(System.console().readLine());
      
      if ((inicio <= 0) || (inicio >= 9)) { //Comprobar que sea > que 0 y  < que 9
        System.out.println("Introduce un valor entre 0 y 9");
        comprobar = false;
      }
      System.out.print("Introduce fin: ");
      fin = Integer.parseInt(System.console().readLine());
      
      if ((fin <= 0) || (fin >= 9)) { //Comprobar que sea > que 0 y  < que 9
        System.out.println("Introduce un valor entre 0 y 9");
        comprobar = false;
      }
      if (inicio >= fin) { //Comprobar que inicio sea menor que el fin
        System.out.println("El valor inicial tiene que ser menor que el valor final");
        comprobar = false;
      }
    } while (!comprobar);
    System.out.println("");
    System.out.println("Original");
    for (int i = 0; i < 10; i++) { //Para mostrar el array original
      System.out.print(lista[i] + " ");
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) { //Copiamos un array en otro
      resul[i] = lista[i];
    }
    resul[fin] = lista[inicio]; //Cambia los valores a las posiciones indicadas
    for (int i = fin + 1; i < 10; i++) {
      resul[i] = lista[i-1]; //Coloca los valores en un indice menos
      resul[0] = lista[9];
    }
    for (int i = 0; i < inicio; i++) {
      resul[i+1] = lista[i]; //Coloca los valores en un indice mas
    }
    System.out.println("");
    System.out.println("Resultado");
    for (int i = 0; i < 10; i++) { //Para mostrar el resultante
      System.out.print(resul[i] + " ");
    }
  }
}
