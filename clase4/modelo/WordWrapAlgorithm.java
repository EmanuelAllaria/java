package clase4.modelo;

import java.util.ArrayList;
import java.util.List;

public class WordWrapAlgorithm {
    public static List<String> adjustWords(String input, int lineLength) {
        List<String> result = new ArrayList<>();

        if (input.length() <= lineLength) {
            result.add(input);
            return result;
        }

        String[] words = input.split("\\s+");
        StringBuilder currentLine = new StringBuilder();
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + word.length() <= lineLength) {
                currentLine.append(word).append(" ");
                currentLength += word.length() + 1;
            } else {
                result.add(currentLine.toString().trim());
                currentLine = new StringBuilder(word + " ");
                currentLength = word.length() + 1;
            }
        }

        if (currentLine.length() > 0) {
            result.add(currentLine.toString().trim());
        }

        // Adjust long words
        List<String> adjustedResult = new ArrayList<>();
        for (String line : result) {
            if (line.length() > lineLength) {
                int start = 0;
                int end = lineLength;
                while (start < line.length()) {
                    adjustedResult.add(line.substring(start, end));
                    start += lineLength;
                    end = Math.min(start + lineLength, line.length());
                }
            } else {
                adjustedResult.add(line);
            }
        }

        return adjustedResult;
    }

    public static void main(String[] args) {
        // Prueba 1
        int lineLength1 = 60;
        String input1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        List<String> result1 = adjustWords(input1, lineLength1);
        System.out.println("Resultado 1:");
        for (String line : result1) {
            System.out.println(line);
        }
        System.out.println();

        // Prueba 2
        int lineLength2 = 7;
        String input2 = "Hello Word!";
        List<String> result2 = adjustWords(input2, lineLength2);
        System.out.println("Resultado 2:");
        for (String line : result2) {
            System.out.println(line);
        }
        System.out.println();

        // Prueba 3
        int lineLength3 = 3;
        String input3 = "a b c d e f";
        List<String> result3 = adjustWords(input3, lineLength3);
        System.out.println("Resultado 3:");
        for (String line : result3) {
            System.out.println(line);
        }
        System.out.println();

        // Prueba 4
        int lineLength4 = 5;
        String input4 = "Excelente";
        List<String> result4 = adjustWords(input4, lineLength4);
        System.out.println("Resultado 4:");
        for (String line : result4) {
            System.out.println(line);
        }
    }
}
