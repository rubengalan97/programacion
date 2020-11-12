public class Ejercicio10Tema6 {
  public static void main(String[] args) {
  
    for (int i = 0; i < 10; i++) {
      int aleatorio = (int)(Math.random()*40+1);
      int caracter = (int) (Math.random()*6);
      for (int j = 0; j< aleatorio; j++) {
        switch(caracter) {
          case 0:
            System.out.print("*");
          break;
          case 1:
            System.out.print("-");
          break;
          case 2:
            System.out.print("=");
          break;
          case 3:
            System.out.print(".");
          break;
          case 4:
            System.out.print("|");
          break;
          case 5:
            System.out.print("@");
          break;
          default:
        }
      }
      System.out.println("");
    }
  }
}
