package clase4.modelo;

import java.util.HashMap;
import java.util.Map;

public class ChequeAmountConverter {
    private static final String[] UNIDADES = {
            "", "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce",
            "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
    };

    private static final String[] DECENAS = {
            "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };

    private static final String[] CENTENAS = {
            "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos",
            "ochocientos", "novecientos"
    };

    private static final String[] MAGNITUDES = {
            "", "mil", "millón", "mil millones", "billón"
    };

    private static final Map<Integer, String> UNIDADES_ESPECIALES;

    static {
        UNIDADES_ESPECIALES = new HashMap<>();
        UNIDADES_ESPECIALES.put(1, "un");
        UNIDADES_ESPECIALES.put(2, "dos");
    }

    public static String convertToText(double amount) {
        String[] parts = String.valueOf(amount).split("\\.");

        int integerPart = Integer.parseInt(parts[0]);
        int fractionPart = Integer.parseInt(parts[1]);

        StringBuilder cheque = new StringBuilder();

        // Convertir la parte entera
        if (integerPart == 0) {
            cheque.append("cero");
        } else {
            cheque.append(convertNumber(integerPart));
        }

        cheque.append(" dólares");

        // Convertir la parte decimal
        if (fractionPart > 0) {
            cheque.append(" y ");
            cheque.append(String.format("%02d", fractionPart));
            cheque.append("/100");
        }

        return cheque.toString();
    }

    private static String convertNumber(int number) {
        if (number < 20) {
            return UNIDADES[number];
        } else if (number < 100) {
            int unidad = number % 10;
            int decena = number / 10;
            String decenaText = DECENAS[decena];
            if (unidad > 0) {
                decenaText += " y " + UNIDADES[unidad];
            }
            return decenaText;
        } else if (number < 1000) {
            int centena = number / 100;
            int resto = number % 100;
            String centenaText = CENTENAS[centena];
            if (resto > 0) {
                centenaText += " " + convertNumber(resto);
            }
            return centenaText;
        } else {
            int magnitudeIndex = 0;
            String result = "";
            while (number > 0) {
                int triplet = number % 1000;
                number /= 1000;
                if (triplet > 0) {
                    String tripletText = convertNumber(triplet);
                    if (magnitudeIndex > 0) {
                        tripletText += " " + MAGNITUDES[magnitudeIndex];
                    }
                    if (!result.isEmpty()) {
                        result = tripletText + " " + result;
                    } else {
                        result = tripletText;
                    }
                }
                magnitudeIndex++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        double amount = 1500258.99;
        System.out.println(convertToText(amount));
    }
}
