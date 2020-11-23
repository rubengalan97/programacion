public class Ejercicio14Tema7 {
  public static void main(String[] args) {
  
    //Preguntar que he hecho mal
    //Declaracion de variables
  
    String [] lista = new String [8];
    String [] colores = {"verde", "rojo", "azul", "naranja", "rosa", "amarillo", "negro", "blanco", "morado"};
    String [] resul = new String [8];
    int contador = 0;
    String palabras;
    
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce una palabra: ");
      palabras = System.console().readLine();
      lista[i] = palabras;
    }
    for (int i = 0; i < lista.length; i++) {
      for( int j = 0; j < colores.length; j++) {
        if (lista[i].equals(colores[j])) {
          resul[contador++] = lista[i];
        }
      }
    }
    /*for (int i = 0; i < lista.length; i++) {
      for( int j = contador; j < colores.length; j++) {
        if (!(lista[i].equals(colores[j]))) {
          resul[j] = lista[i];
        }
      }
    }*/
    for (int i = 0; i < 8; i++) {
      System.out.print(resul[i] + " ");
    }
  }
}
