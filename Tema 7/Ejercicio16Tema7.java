public class Ejercicio16Tema7 {
  public static void main(String[] args) {
    
    //Declaracion de variables
    
    int [] lista = new int [20];
    int destacar;
    
    for (int i = 0; i < 20; i++) { //Introducir valores en el array
      lista[i] = (int)(Math.random()*401);
    }
     for (int i = 0; i < 20; i++) { //Mostrar el array
      System.out.print(lista[i] + " ");
    }
    System.out.println("");
    System.out.print("¿Que multiplos quieres sacar de 5 o 7?: ");
    destacar = Integer.parseInt(System.console().readLine());
    
    switch (destacar) { //Opciones de multiplos
      case 5:
        for (int i = 0; i < 20; i++) {
          if (lista[i] % 5 == 0) { //Si es multiplo de 5 le añade [  ]
            System.out.print("[" + lista[i] + "] ");
          } else { //Sino un espacio
            System.out.print(lista[i] + " ");
          }
        }
      break;
      case 7:
        for (int i = 0; i < 20; i++) {
          if (lista[i] % 7 == 0) { //Si es multiplo de 7 le añade [  ]
            System.out.print("[" + lista[i] + "] ");
          } else { //Sino un espacio
            System.out.print(lista[i] + " ");
          }
        }
      break;
      default:
    }
  }
}
