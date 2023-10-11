public class TextCounter {
    public static int countCharacters(String text) {
        return text.length();
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    public static int countSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        return spaces;
    }
}
