public class Ejercicio6 {
  public static void main(String[] args) {
    double precio;
    int iva;
    double ivaproducto;
    double total;
    
    precio = 50;
    iva = 21;
    ivaproducto = (50 * 21)/100;
    total = precio + ivaproducto;
    System.out.printf("El precio del producto es: %.2f € \n", precio);
    System.out.println("El porcentaje de IVA del producto es: " + iva + "%");
    System.out.printf("El precio del IVA del producto es: %.2f € \n", ivaproducto);
    System.out.printf("El precio total con IVA es: %.2f €", total);
}
}
