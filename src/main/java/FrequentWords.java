import java.util.*;

public class FrequentWords {
    public static Map<String, Integer> countFrequentWords(String text, List<String> stopwords) {
        String[] words = text.split("\\s+");

        // Count word frequency, excluding stopwords
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            String normalizedWord = word.toLowerCase(); // Normalize to lowercase
            if (!stopwords.contains(normalizedWord)) {
                wordCount.put(normalizedWord, wordCount.getOrDefault(normalizedWord, 0) + 1);
            }
        }

        // Sort by frequency (descending order)
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Limit the result to the top 10 most frequent words
        int limit = Math.min(sortedWords.size(), 10);
        List<Map.Entry<String, Integer>> topWords = sortedWords.subList(0, limit);

        // Convert the sorted list back to a map
        Map<String, Integer> sortedWordMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : topWords) {
            sortedWordMap.put(entry.getKey(), entry.getValue());
        }

        return sortedWordMap;
    }
}
