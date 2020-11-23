public class Ejercicio13Tema7 {
  public static void main(String[] args) {
  
    //Preguntar si es mejor esta forma o la que hay en el libro
    //Declaracion de variables
  
    int maximo = 0; //Asi siempre habra un valor mayor que el
    int minimo = 500; //Asi siempre habra un valor menor que el
    String destacar;
    int [] lista = new int [100];
    
    for (int i = 0; i < 100; i++) { //Introducir valores en el array
      lista[i] = (int)(Math.random()*501); //Crear valores entre 0 y 500
      System.out.print(lista[i] + " ");
        if (lista[i] > maximo) { //Saber cual es el valor mayor
          maximo = lista[i];
        }
        if (lista[i] < minimo) { //Saber cual es el valor menor
          minimo = lista[i];
        }
    }
    System.out.println("");
    System.out.print("¿Cual quieres destacar el valor maximo o minimo?: ");
    destacar = System.console().readLine();
    switch (destacar) { //Opciones para que destacar
      case "maximo": //Si la opcion elegida es el maximo
        for (int i = 0; i < 100; i++) {
          if (lista[i] == maximo) { //Cuando el valor sea el maximo le añade **
            System.out.print(" **" + lista[i] + "** ");
          } else { //Cuando no es pone espacio
            System.out.print(lista[i] + " ");
          }
        }
        break;
      case "minimo": //Si la opcion elegida es el minimo
        for (int i = 0; i < 100; i++) {
          if (lista[i] == minimo) { //Cuando el valor sea el minimo le añade **
            System.out.print(" **" + lista[i] + "** ");
          } else { //Cuando no pone espacio
            System.out.print(lista[i] + " ");
          }
        }
        break;
      default:
    }
  }
}
