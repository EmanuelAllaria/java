package clase4.modelo;

import java.util.HashMap;
import java.util.Map;

public class AmericanSoundex {
    public static String getSoundexCode(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        // Convertir la palabra a mayúsculas
        word = word.toUpperCase();

        // Remover caracteres no alfabéticos
        StringBuilder cleanWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                cleanWord.append(c);
            }
        }

        // Verificar si la palabra es vacía después de limpiarla
        if (cleanWord.length() == 0) {
            return "";
        }

        // Obtener el primer carácter
        char firstChar = cleanWord.charAt(0);

        // Reemplazar letras según las reglas de codificación
        StringBuilder soundexCode = new StringBuilder();
        soundexCode.append(firstChar);

        Map<Character, Character> encodingMap = createEncodingMap();

        for (int i = 1; i < cleanWord.length(); i++) {
            char currentChar = cleanWord.charAt(i);

            // Reemplazar la letra según la codificación
            char encodedChar = encodingMap.getOrDefault(currentChar, '0');

            // No agregar caracteres duplicados
            if (encodedChar != soundexCode.charAt(soundexCode.length() - 1)) {
                soundexCode.append(encodedChar);
            }
        }

        // Asegurarse de que el código sea de longitud 4
        while (soundexCode.length() < 4) {
            soundexCode.append('0');
        }

        return soundexCode.toString();
    }

    private static Map<Character, Character> createEncodingMap() {
        Map<Character, Character> encodingMap = new HashMap<>();
        encodingMap.put('B', '1');
        encodingMap.put('F', '1');
        encodingMap.put('P', '1');
        encodingMap.put('V', '1');
        encodingMap.put('C', '2');
        encodingMap.put('G', '2');
        encodingMap.put('J', '2');
        encodingMap.put('K', '2');
        encodingMap.put('Q', '2');
        encodingMap.put('S', '2');
        encodingMap.put('X', '2');
        encodingMap.put('Z', '2');
        encodingMap.put('D', '3');
        encodingMap.put('T', '3');
        encodingMap.put('L', '4');
        encodingMap.put('M', '5');
        encodingMap.put('N', '5');
        encodingMap.put('R', '6');
        return encodingMap;
    }

    public static void main(String[] args) {
        String word = "Laravel";
        String soundexCode = getSoundexCode(word);
        System.out.println("Soundex code for '" + word + "': " + soundexCode);
    }
}
