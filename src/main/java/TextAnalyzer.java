import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text for analysis:");
        String inputText = scanner.nextLine();

        List<String> stopwords = Arrays.asList("the", "and", "in", "of", "a", "to");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Count Characters");
            System.out.println("2. Count Words");
            System.out.println("3. Count Sentences");
            System.out.println("4. Count Spaces");
            System.out.println("5. Calculate Average Word Length");
            System.out.println("6. Find Shortest Word");
            System.out.println("7. Find Longest Word");
            System.out.println("8. Count Most Frequent Words (excluding stopwords)");
            System.out.println("9. Exit");

            try {
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (option) {
                    case 1:
                        int charCount = TextCounter.countCharacters(inputText);
                        System.out.println("Character count: " + charCount);
                        break;
                    case 2:
                        int wordCount = TextCounter.countWords(inputText);
                        System.out.println("Word count: " + wordCount);
                        break;
                    case 3:
                        int sentenceCount = TextCounter.countSentences(inputText);
                        System.out.println("Sentence count: " + sentenceCount);
                        break;
                    case 4:
                        int spaceCount = TextCounter.countSpaces(inputText);
                        System.out.println("Space count: " + spaceCount);
                        break;
                    case 5:
                        double avgWordLength = WordAnalyzer.calculateAverageWordLength(inputText);
                        System.out.println("Average word length: " + avgWordLength);
                        break;
                    case 6:
                        String shortestWord = WordAnalyzer.findShortestWord(inputText);
                        System.out.println("Shortest word: " + shortestWord);
                        break;
                    case 7:
                        String longestWord = WordAnalyzer.findLongestWord(inputText);
                        System.out.println("Longest word: " + longestWord);
                        break;
                    case 8:
                        Map<String, Integer> frequentWords = FrequentWords.countFrequentWords(inputText, stopwords);
                        System.out.println("Most frequent words (excluding stopwords):");
                        frequentWords.forEach((word, count) -> System.out.println(word + ": " + count));
                        break;
                    case 9:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose a valid option (1-9).");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid menu choice (1-9).");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }
}
