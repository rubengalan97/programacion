public class Ejercicio3Tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un dia de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Número no válido");
    }
  }
}
