public class Ejercicio8Tema6 {
  public static void main(String[] args) {
  
    int numero;
    
    for (int i = 1; i <= 15; i++) {
      numero = (int)(Math.random()*6);
      
      switch (numero) {
        case 0:
        case 1:
        case 2:
        System.out.println("El partido " + i + " gana el equipo 1");
        break;
        case 3:
        case 4:
        System.out.println("El partido " + i + " empate");
        break;
        case 5:
        System.out.println("El partido " + i + " gana el equipo 2");
        break;
        default:
      }
    }   
  }
}
