public class Ejercicio2Tema6 {
  public static void main(String[] args) {
    
    int palos;
    int cartaPalo;
    
    palos = (int)(Math.random()*4+1);
    cartaPalo = (int)(Math.random()*13+1);
    
    switch (palos) {
      case 1:
        System.out.print("La carta es picas");
        break;
      case 2:
        System.out.print("La carta es diamantes");
        break;
      case 3:
        System.out.print("La carta es de corazones");
        break;
      case 4:
        System.out.print("La carta es de treboles");
        break;
      default:
    }
    
    switch (cartaPalo) {
      case 1:
        System.out.print(" y es el As");
        break;
      case 2:
        System.out.print(" y es el 2");
        break;
      case 3:
        System.out.print(" y es el 3");
        break;
      case 4:
        System.out.print(" y es el 4");
        break;
      case 5:
        System.out.print(" y es el 5");
        break;
      case 6:
        System.out.print(" y es el 6");
        break;
      case 7:
        System.out.print(" y es el 7");
        break;
      case 8:
        System.out.print(" y es el 8");
        break;
        case 9:
        System.out.print(" y es el 9");
        break;
      case 10:
        System.out.print(" y es el 10");
        break;
      case 11:
        System.out.print(" y es la J");
        break;
      case 12:
        System.out.print(" y es la Q");
        break;
      case 13:
        System.out.print(" y es la K");
        break;
      default:
    }
    
  }
}
