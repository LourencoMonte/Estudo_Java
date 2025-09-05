import java.util.LinkedList;
import java.util.List;

public class Words {
    private String word;
    private List<Integer> occurrences;

    public Words(String word) {
        this.word = word;
        this.occurrences = new LinkedList<>();
    }

    public String getWord() {
        return word;
    }

    public List<Integer> getOccurrences() {
        return occurrences;
    }

    public void addOccurrence(int linha) {
        this.occurrences.add(linha);
    }

    @Override
    public String toString() {
        String occurrences = "";
        for (Integer occurrence : this.occurrences) {
            occurrences += occurrence + " ";
        }
        return this.word + " " + occurrences;
    }
}