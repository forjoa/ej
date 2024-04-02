package ej;

public class karaca {
    public static void main(String[] args) {
        String word = "apple";
        String wordEncrypted = encrypt(word);
        System.out.println(wordEncrypted);
    }

    public static String encrypt(String word) {
        String[] wordSplitted = word.split("");
        String[] wordEncryptedB = new String[wordSplitted.length];
        String wordEncrypted = "";
        for (int i = 0; i < wordSplitted.length; i++) {
            switch (wordSplitted[i].toLowerCase()) {
                case "a":
                    wordEncryptedB[i] = "0";
                    break;
                case "e":
                    wordEncryptedB[i] = "1";
                    break;
                case "i":
                    wordEncryptedB[i] = "2";
                    break;
                case "o":
                    wordEncryptedB[i] = "3";
                    break;
                case "u":
                    wordEncryptedB[i] = "4";
                    break;
                default:
                    wordEncryptedB[i] = wordSplitted[i].toLowerCase();
                    break;
            }
            wordEncrypted += wordEncryptedB[i];
        }
        return wordEncrypted;
    }
}
