public class Ejercicio2Tema7 {
  public static void main(String[] args) {
  
    //Declaración de variables
  
    int [][] lista = new int [4][5];
    int sumaFilas;
    int sumaColumnas;
    int sumaTotal = 0;
  
    for (int i = 0; i < 4; i++) { //Para introducir valores en la fila
      for (int j = 0; j < 5; j++) { //Para introducir valores en la columna
        lista[i][j] = (int)(Math.random()*10);
        System.out.print(lista[i][j] + " ");
      }
      System.out.println("");
    }
    for (int i = 0; i < 4; i++) { //Para sumar los valores de la fila
      sumaFilas = 0; //Se resetea en cada pasada a 0 para que no se sumen entre filas
      for (int j = 0; j < 5; j++) {
        sumaFilas += lista[i][j];
    }
      System.out.println("La suma de los valores de la fila " + (i+1) + " son: " + sumaFilas);
    }
    for (int i = 0; i < 5; i++) { //Para sumar los valores de la columna
      sumaColumnas = 0; //Se resetea en cada pasada a 0 para que no se sumen entre columnas
      for (int j = 0; j < 4; j++) {
        sumaColumnas += lista[j][i];
      }
      sumaTotal += sumaColumnas; //Suma el valor de todos los valores de las columnas
      System.out.println("La suma de los valores de la columna " + (i+1) + " son: " + sumaColumnas);
    }
    System.out.print("La suma total es: " + sumaTotal);
  }
}
