import java.util.Map;
import java.util.TreeMap;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<String, Etudiant> etudiants = new TreeMap<>();

        etudiants.put("101", new Etudiant("Pierre"));
        etudiants.put("102", new Etudiant("Marie"));
        etudiants.put("103", new Etudiant("Jean"));

        Object[] keys = etudiants.keySet().toArray();
        int i = 0;
        while (i < keys.length) {
            String key = (String) keys[i];
            System.out.println(key + ": " + etudiants.get(key));
            i++;
        }
    }
}

class Etudiant {
    private String prenom;

    public Etudiant(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return prenom;
    }
}