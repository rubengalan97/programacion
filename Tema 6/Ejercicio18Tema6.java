public class Ejercicio18Tema6 {
  public static void main(String[] args) {
  
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int color1 = 0;
    int color2 = 0;
    int color3 = 0;
  
    for (int i = 0; i < 1000; i++) {
      
      do{
      
        color1 = (int) (Math.random()*6+1);
        color2 = (int) (Math.random()*6+1);
        color3 = (int) (Math.random()*6+1);
      
      } while (color1 == color2 || color1 == color3 || color2 == color3);
        
        //System.out.println(color1 + "" + color2 + "" + color3);
        
        if (color1 == 1 || color2 == 1 || color3 == 1) {
          num1++;
        }
        if (color1 == 2 || color2 == 2 || color3 == 2) {
          num2++;
        }
        if (color1 == 4 || color2 == 4 || color3 == 4) {
          num3++;
        }
        if (color1 == 4 || color2 == 4 || color3 == 4) {
          num4++;
        }
        if (color1 == 5 || color2 == 5 || color3 == 5) {
          num5++;
        }
        if (color1 == 6 || color2 == 6 || color3 == 6) {
          num6++;
        }
    }
    System.out.println("El número 1 ha salido: " + num1 + " veces.");
    System.out.println("El número 2 ha salido: " + num2 + " veces.");
    System.out.println("El número 3 ha salido: " + num3 + " veces.");
    System.out.println("El número 4 ha salido: " + num4 + " veces.");
    System.out.println("El número 5 ha salido: " + num5 + " veces.");
    System.out.println("El número 6 ha salido: " + num6 + " veces.");
  }
}
