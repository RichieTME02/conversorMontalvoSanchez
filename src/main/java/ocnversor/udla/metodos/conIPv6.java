package ocnversor.udla.metodos;

public class conIPv6 {
    public static String ipv6ToBinary(String ipv6) {
        String[] parts = ipv6.split(":");
        StringBuilder binary = new StringBuilder();
        for (String part : parts) {
            binary.append(Integer.toBinaryString(Integer.parseInt(part, 16))).append(":");
        }
        // Eliminar el último dos puntos
        return binary.toString().trim();
    }

    public static String binaryToIpv6(String binary) {
        String[] parts = binary.split(":");
        StringBuilder ipv6 = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                ipv6.append(":");
            }
            ipv6.append(Integer.toHexString(Integer.parseInt(parts[i], 2)));
        }
        return ipv6.toString();
    }
}
