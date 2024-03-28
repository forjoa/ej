package ej;

import java.util.HashMap;

public class MorseConverter {
    
    private static final HashMap<String, String> morseToText = new HashMap<>();
    private static final HashMap<String, String> textToMorse = new HashMap<>();

    static {
        morseToText.put(".-", "A");
        morseToText.put("-...", "B");
        morseToText.put("-.-.", "C");
        morseToText.put("-..", "D");
        morseToText.put(".", "E");
        morseToText.put("..-.", "F");
        morseToText.put("--.", "G");
        morseToText.put("....", "H");
        morseToText.put("..", "I");
        morseToText.put(".---", "J");
        morseToText.put("-.-", "K");
        morseToText.put(".-..", "L");
        morseToText.put("--", "M");
        morseToText.put("-.", "N");
        morseToText.put("---", "O");
        morseToText.put(".--.", "P");
        morseToText.put("--.-", "Q");
        morseToText.put(".-.", "R");
        morseToText.put("...", "S");
        morseToText.put("-", "T");
        morseToText.put("..-", "U");
        morseToText.put("...-", "V");
        morseToText.put(".--", "W");
        morseToText.put("-..-", "X");
        morseToText.put("-.--", "Y");
        morseToText.put("--..", "Z");
        morseToText.put(".----", "1");
        morseToText.put("..---", "2");
        morseToText.put("...--", "3");
        morseToText.put("....-", "4");
        morseToText.put(".....", "5");
        morseToText.put("-....", "6");
        morseToText.put("--...", "7");
        morseToText.put("---..", "8");
        morseToText.put("----.", "9");
        morseToText.put("-----", "0");

        for (String key : morseToText.keySet()) {
            textToMorse.put(morseToText.get(key), key);
        }
    }

    public static String toMorse(String text) {
        StringBuilder morse = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') {
                morse.append("   "); // tres espacios para separar palabras
            } else if (textToMorse.containsKey(Character.toString(c))) {
                morse.append(textToMorse.get(Character.toString(c))).append(" "); // un espacio para separar letras
            }
        }
        return morse.toString();
    }

    public static String toText(String morse) {
        StringBuilder text = new StringBuilder();
        String[] words = morse.split("   "); // palabras separadas por tres espacios
        for (String word : words) {
            String[] letters = word.split(" "); // letras separadas por un espacio
            for (String letter : letters) {
                if (morseToText.containsKey(letter)) {
                    text.append(morseToText.get(letter));
                }
            }
            text.append(" "); // un espacio entre palabras
        }
        return text.toString();
    }

    public static void main(String[] args) {
        String input = "HELLO WORLD";
        String morse = toMorse(input);
        System.out.println("Texto a morse: " + morse);
        System.out.println("Morse a texto: " + toText(morse));

        String morseInput = ".... . .-.. .-.. ---   .-- --- .-. .-.. -..";
        System.out.println("Morse a texto: " + toText(morseInput));
    }
}

