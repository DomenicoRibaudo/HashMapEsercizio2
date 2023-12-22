import java.util.*;

//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
public class Main {
    public static void main(String[] args) {
        // Creare un hasmap
        Map<String, String> mappa = new HashMap<>();
        mappa.put("Palermo", "PA");
        mappa.put("Torino", "TO");

        // Ottenere i valori
        List<String> valori = new ArrayList<>(mappa.values());

        // Ordinare i valori
        Collections.sort(valori);

        // Stampare i valori ordinati
        System.out.println("Valori ordinati: " + valori);

    }
}
