package ocnversor.udla.metodos;

public class conIPv4 {
    public static String ipv4ToBinary(String ipv4) {
        String[] parts = ipv4.split("\\.");
        StringBuilder binary = new StringBuilder();
        for (String part : parts) {
            binary.append(Integer.toBinaryString(Integer.parseInt(part))).append(".");
        }
        // Eliminar el último punto
        return binary.toString().trim();
    }

    public static String binaryToIpv4(String binary) {
        String[] parts = binary.split("\\.");
        StringBuilder ipv4 = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                ipv4.append(".");
            }
            ipv4.append(Integer.parseInt(parts[i], 2));
        }
        return ipv4.toString();
    }
}
