import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableHash {
    private Map<Character, List<Words>> tabela;

    public TableHash() {
        this.tabela = new HashMap<>();
    }

    public void insert(Words palavra) {
        char key = palavra.getWord().toLowerCase().charAt(0);

        if (!tabela.containsKey(key)) {
            tabela.put(key, new ArrayList<>());
        }

        tabela.get(key).add(palavra);
    }

    public List<Words> search(char key) {
        return tabela.getOrDefault(Character.toLowerCase(key), new ArrayList<>());
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}