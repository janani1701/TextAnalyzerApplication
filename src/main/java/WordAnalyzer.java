public class WordAnalyzer {
    public static double calculateAverageWordLength(String text) {
        String[] words = text.split("\\s+");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (double) totalLength / words.length;
    }

    public static String findShortestWord(String text) {
        String[] words = text.split("\\s+");
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
