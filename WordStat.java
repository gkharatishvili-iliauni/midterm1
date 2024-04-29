package midterm.giorgi_kharatishvili_4.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        HashSet<String> words = new HashSet<>();
        words.addAll(fantasyFormatData);

        System.out.println(words);

        try (FileWriter writer = new FileWriter("./task4.txt")) {
            for (String word : words) {
                writer.write(word + "\n");
            }
            writer.write("\n\n");

            HashMap<Integer, Integer> wordLengthMap = new HashMap<Integer, Integer>();

            for (String word : words) {
                int length = word.length();
                if (wordLengthMap.containsKey(length)) {
                    wordLengthMap.put(length, wordLengthMap.get(length) + 1);
                } else {
                    wordLengthMap.put(length, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
                String output = "Length: " + entry.getKey() + ", Frequency: " + entry.getValue();
                System.out.println(output);
                writer.write(output + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
