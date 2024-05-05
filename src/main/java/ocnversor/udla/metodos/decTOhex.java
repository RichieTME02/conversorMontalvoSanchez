package ocnversor.udla.metodos;

public class decTOhex {
    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int hexToDecimal(String hex) {
        try {
            return Integer.parseInt(hex, 16);
        } catch (NumberFormatException e) {
            return -1; // Retorna -1 o cualquier valor indicativo de error
        }
    }
}
