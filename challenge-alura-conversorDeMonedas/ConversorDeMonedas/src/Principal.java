import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMonedas consulta = new ConsultarMonedas();

        int opcion=0;
        while (opcion !=8){
            System.out.println("************************\n"+
                    """   
                    Bienvenidos al conversor de monedas

                    Ingresa la conversion que deseas realizar

                    1. Dólar estadounidense a Real brasileño
                    2. Real brasileño a Dólar estadounidense
                    3. Dólar estadounidense a Peso colombiano
                    4. Peso argentino a Dólar estadounidense
                    5. Boliviano boliviano a Dólar estadounidense
                    6. Dólar estadounidense a Boliviano boliviano
                    7. Convertir otra moneda
                    8. Salir. 
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMonedas.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 2:
                    ConvertirMonedas.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMonedas.convertir("USD", "COP", consulta, lectura);
                    break;
                case 4:
                    ConvertirMonedas.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMonedas.convertir("BOB", "USD", consulta, lectura);
                    break;
                case 6:
                    ConvertirMonedas.convertir("USD", "BOB", consulta, lectura);
                    break;
                case 7:
                    ConvertirMonedas.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

        }

    }

