public class Ejercicio5Tema7 {
  public static void main(String[] args) {
    
    //Declaración de variables
    
    int [][] lista = new int [6][10];
    int maximo = 0;
    int minimo = 100;
    boolean parar = false;
    boolean parar2 = false;
    int posicionMaxX = 0;
    int posicionMaxY = 0;
    int posicionMinX = 0;
    int posicionMinY = 0;
    
    for (int i = 0; i < 6; i++) { //Para introducir valores en la fila
      for (int j = 0; j < 10; j++) { //Para introducir valores en la columna
        lista[i][j] = (int)(Math.random()*1001);
        if(lista[i][j] > maximo) { //Saber cual es el valor maximo
          maximo = lista[i][j];
        }
        if(lista[i][j] < minimo) { //Saber cual es el valor minimo
          minimo = lista[i][j];
        }
      }
    }
    for (int i = 0; i < 6; i++) { //Para mostrar los valores de las filas
      for (int j = 0; j < 10; j++) { //Para mostrar los valores de las columnas
        System.out.print(lista[i][j] + " ");
      }
      System.out.println("");
    }
    for (int i = 0; (i < 6 || parar == true && parar2 == true); i++) { //Para que deje de buscar cuando tenga ya los valores maximos y minimos
      parar = false;
      parar2 = false;
      for (int j = 0; j < 10; j++) {
        if (lista[i][j] == maximo) { //Comprobar si el valor es el maximo
          posicionMaxX = i;
          posicionMaxY = j;
          parar = true;
        }
        if (lista[i][j] == minimo) { //Comprobar si el valor es el minimo
          posicionMinX = i;
          posicionMinY = j;
          parar2 = true;
        }
      }
    }
    System.out.println("La posicion del valor maximo es: [" + posicionMaxX + "," + posicionMaxY + "]"); //Mostrar las posiciones donde se encuentra el maximo
    System.out.print("La posicion del valor minimo es: [" + posicionMinX + "," + posicionMinY + "]"); //Mostrar las posiciones donde se encuentra el minimo
  }
}
