public class Ejercicio7Tema6 {
  public static void main(String[] args) {
  
    int numero;
    
    for (int i = 1; i <= 15; i++) {
      numero = (int)(Math.random()*3);
      
      switch (numero) {
        case 0:
        System.out.println("El partido " + i + " gana el equipo 1");
        break;
        case 1:
        System.out.println("El partido " + i + " empate");
        break;
        case 2:
        System.out.println("El partido " + i + " gana el equipo 2");
        break;
        default:
      }
    }    
  }
}
