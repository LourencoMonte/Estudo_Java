import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        TableHash table = new TableHash();
        int numbLine = 1;

        try (Reader reader = new FileReader("src/teste.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String wordsLine;

            while ((wordsLine = br.readLine()) != null) {
                String[] wordsList = wordsLine.toLowerCase().split("[\\s.,;!?(){}\\[\\]\"']+");
                for (String word : wordsList) {
                    if (!word.isEmpty()) {
                        Words words = new Words(word);
                        List<Words> wordsTable = table.search(word.charAt(0));
                        boolean existsWord = false;
                        for (Words existingWord : wordsTable) {
                            if (existingWord.getWord().equals(word)) {
                                existingWord.addOccurrence(numbLine);
                                existsWord = true;
                                break;
                            }
                        }
                        if (!existsWord) {
                            words.addOccurrence(numbLine);
                            table.insert(words);
                        }
                    }
                }
                numbLine++;
            }
        } catch (IOException e) {
            System.err.println("Error to find file: " + e.getMessage());
        }

        List<Words> finalWords = new ArrayList<Words>();
        try (Reader reader = new FileReader("src/keyWords.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String wordsLine;

            while ((wordsLine = br.readLine()) != null) {
                String[] wordsList = wordsLine.split("[\\s.,;!?(){}\\[\\]\"']+");
                for (String word : wordsList) {
                    if (!word.isEmpty()) {
                        List<Words> wordsTable = table.search(word.charAt(0));
                        boolean existsWord = false;

                        for (Words existingWord : wordsTable) {
                            if (existingWord.getWord().equals(word)) {
                                finalWords.add(existingWord);
                                existsWord = true;
                                break;
                            }
                        }
                        if (!existsWord) {
                            Words newWord = new Words(word);
                            finalWords.add(newWord); 
                        }
                    }
                }
            }
            Collections.sort(finalWords, (w1, w2) -> w1.getWord().compareTo(w2.getWord()));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        for (Words word : finalWords) {
            System.out.println(word);
        }

        File outputFile = new File("src/result.txt");
        if (outputFile.exists()) {
            outputFile.delete();
        }

        try (PrintWriter writer = new PrintWriter("src/result.txt", "UTF-8")) {
            for (Words word : finalWords) {
                writer.println(word.toString());
            }
        } catch (Exception e) {
            System.err.println("Error generating file: " + e.getMessage());
        }

    }
}
