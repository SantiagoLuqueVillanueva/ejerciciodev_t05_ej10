public class App {
    public static void main(String[] args) throws Exception {
        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar introduzca un número negativo.");
        System.out.print("Vaya introduciando números: ");

        while (numeroIntroducido >= 0) {
            numeroIntroducido = Double.parseDouble(System.console().readLine());
            numeros++;
            suma += numeroIntroducido;
        }

        System.out.printf("La media de los números positivos introducidos es %.2f", (suma - numeroIntroducido) / (numeros - 1));
    }
}
