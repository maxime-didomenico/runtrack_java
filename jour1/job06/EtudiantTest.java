import java.util.ArrayList;
import java.util.List;

public class EtudiantTest {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        etudiant.name = "John Cena";
        etudiant.addNotes(15);
        etudiant.addNotes(12);
        etudiant.addNotes(18);
        etudiant.addNotes(10);
        System.out.println(etudiant.highestNote());
        System.out.println(etudiant.lowestNote());
        System.out.println(etudiant.averageNote());
        etudiant.printNotes();
    }
}

class Etudiant {
    String name;
    float[] notes = new float[99];

    public void addName(String name) {
        this.name = name;
    }

    public void addNotes(float note) {
        int i = 0;
        while (this.notes[i] != 0) {
            i++;
        }
        this.notes[i] = note;
    }

    public float highestNote() {
        float highestNote = 0;
        int i = 0;
        while (this.notes[i] != 0) {
            if (this.notes[i] > highestNote) {
                highestNote = this.notes[i];
            }
            i++;
        }
        return highestNote;
    }

    public float lowestNote() {
        float lowestNote = 20;
        int i = 0;
        while (this.notes[i] != 0) {
            if (this.notes[i] < lowestNote) {
                lowestNote = this.notes[i];
            }
            i++;
        }
        return lowestNote;
    }

    public float averageNote() {
        float averageNote = 0;
        int i = 0;
        while (this.notes[i] != 0) {
            averageNote += this.notes[i];
            i++;
        }
        averageNote /= i;
        return averageNote;
    }

    public void printNotes() {
        int i = 0;
        while (this.notes[i] != 0) {
            System.out.print("[" + this.notes[i] + "]");
            i++;
        }
        System.out.println();
    }
}