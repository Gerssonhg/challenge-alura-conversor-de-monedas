import java.util.Scanner;

public class ConvertirMonedas {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMonedas consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para el día de hoy\n1 " + monedaBase + " = " + monedas.getConversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.getConversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.getTarget_code());
    }

    public static void convertirOtraMoneda(ConsultarMonedas consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}