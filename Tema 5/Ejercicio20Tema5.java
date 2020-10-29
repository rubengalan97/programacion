public class Ejercicio20Tema5 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int planta = 1;
    
    //Para pintar los espacios por delante de la piramide
    
    int espacios = alturaIntroducida-1;
    
    //Para pintar los espacios internos de la piramide. Empieza en 0 ya que la primera linea solo pinta un caracter por lo tanto  no tiene espacios internos
    
    int espaciosInternos = 0;
    
    //Mientras que la la piramide no tenga la altura introducida ejecuta todo
    
    while (planta < alturaIntroducida) {
      
      //Para introducir espacios por delante de la piramide
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      //Para pintar el caracter antes que los espacios intermedios
      
      System.out.print(relleno);
      
      //Para pintar los espacios internos de la piramide
      
      for (int i = 1; i < espaciosInternos; i++) {
        System.out.print(" "); 
      }
      
      if (planta > 1) {
        System.out.print(relleno);
      }
      
      //Para saltar de linea cada vez que se haga una vuelta a los bucles
      
      System.out.println();
      
      //La fila aumenta de 1 en 1
      
      planta++;
      
      //Los espacios que hay por delante de la piramide van decrementandose de 1 en 1
      
      espacios--; 
      
      //Los espacios internos aumentan de 2 en 2
      
      espaciosInternos+=2;
    }
    
    //Para pintar la BASE de la piramide
    
    for (int i = 1; i < planta*2; i++) {
        System.out.print(relleno);
    }
      
    
  }
}

