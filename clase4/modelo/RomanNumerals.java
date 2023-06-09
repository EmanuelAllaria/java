package clase4.modelo;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> ROMAN_NUMERALS = new LinkedHashMap<>();

    static {
        ROMAN_NUMERALS.put(1000, "M");
        ROMAN_NUMERALS.put(900, "CM");
        ROMAN_NUMERALS.put(500, "D");
        ROMAN_NUMERALS.put(400, "CD");
        ROMAN_NUMERALS.put(100, "C");
        ROMAN_NUMERALS.put(90, "XC");
        ROMAN_NUMERALS.put(50, "L");
        ROMAN_NUMERALS.put(40, "XL");
        ROMAN_NUMERALS.put(10, "X");
        ROMAN_NUMERALS.put(9, "IX");
        ROMAN_NUMERALS.put(5, "V");
        ROMAN_NUMERALS.put(4, "IV");
        ROMAN_NUMERALS.put(1, "I");
    }

    public static String toRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Número fuera de rango");
        }

        StringBuilder romanNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : ROMAN_NUMERALS.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            while (number >= value) {
                romanNumber.append(symbol);
                number -= value;
            }
        }

        return romanNumber.toString();
    }

    public static int fromRoman(String romanNumber) {
        int number = 0;
        int i = 0;

        while (i < romanNumber.length()) {
            char currentChar = romanNumber.charAt(i);
            int currentValue = getRomanValue(currentChar);

            if (i + 1 < romanNumber.length()) {
                char nextChar = romanNumber.charAt(i + 1);
                int nextValue = getRomanValue(nextChar);

                if (currentValue < nextValue) {
                    number += (nextValue - currentValue);
                    i += 2;
                    continue;
                }
            }

            number += currentValue;
            i++;
        }

        return number;
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Símbolo romano inválido: " + romanChar);
        }
    }
    
    public static void main(String[] args) {
        int number = 2003;
        String romanNumber = RomanNumerals.toRoman(number);
        System.out.println(romanNumber);

        String romanNumeral = "MMIII";
        int arabicNumber = RomanNumerals.fromRoman(romanNumeral);
        System.out.println(arabicNumber);
    }
}
