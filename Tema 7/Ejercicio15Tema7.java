public class Ejercicio15Tema7 {
  public static void main(String[] args) {
    
    //Declaracion de variables
    
    int [] mesas = new int [10];
    int comensales;
    
    for (int i = 0; i < 10; i++) { //Añade valores aleatorios a las mesas
      mesas[i] = (int)(Math.random()*5);
    }
    do {
      
      for (int i = 0; i < 10; i++) { //Muestra las mesas
        System.out.print(mesas[i] + " ");
      }
      System.out.println("");
      
      System.out.print("Introduce numero de comensales: ");
      comensales = Integer.parseInt(System.console().readLine());
      
      if (comensales > 4) { //Comprueba que no pongas mas de 4 comensales
        System.out.println("El numero de comensales es demasiado grande");
      } else {
          int iVacia = 0; //Saber en la posicion donde esta la primera mesa vacia
          boolean mesavacia = false; //Salir cuando se encuentre una vacia
          for (int i = 9; i >=0; i--) {
            if (mesas[i] == 0) { //Comprueba que esta vacia
              iVacia = i;
              mesavacia = true;
            }
          }
        if (mesavacia) { //Si esta vacia coloca a los comensales
          mesas[iVacia] = comensales;
        } else {
            boolean sentado = false; //Salir cuando encuentre una mesa para los comensales
            int iHueco = 0; //Saber en que posicion se encuentra la mesa
            for (int i = 9; i >= 0; i--) {
              if (comensales <= (4 - mesas[i])) { //Comprobar que caben todos
                iHueco = i;
                sentado = true;
              }
            }
            if (sentado) { //Si hay hueco los coloca
              mesas[iHueco] += comensales;
            }
          }
      }
    } while(comensales >= 1); //Condicion para salir del bucle
    System.out.print("Gracias por su visita");
  }
}
