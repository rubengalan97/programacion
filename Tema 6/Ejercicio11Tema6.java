public class Ejercicio11Tema6 {
  public static void main(String[] args) {
  
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
  
    for (int i = 0; i < 20; i++) {
      int nota = (int) (Math.random()*11);
      switch (nota){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
          suspenso++;
        break;
        case 5:
          suficiente++;
        break;
        case 6:
          bien++;
        break;
        case 7:
        case 8:
          notable++;
        break;
        case 9:
        case 10:
          sobresaliente++;
        break;
        default:
      }
    }
    System.out.println("Has sacado " + suspenso + " suspensos.");
    System.out.println("Has sacado " + suficiente + " suficientes.");
    System.out.println("Has sacado " + bien + " bien.");
    System.out.println("Has sacado " + notable + " notables.");
    System.out.println("Has sacado " + sobresaliente + " sobresalientes.");
  }
}
