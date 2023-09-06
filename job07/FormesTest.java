public class FormesTest {
    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        cercle.setRayon(5);
        System.out.println(cercle.surface());

        Carre carre = new Carre();
        carre.setCote(4);
        System.out.println(carre.surface());
    }
}

class Carre {
    float cote;

    public void setCote(float cote) {
        this.cote = cote;
    }

    public float surface() {
        return this.cote * this.cote;
    }
}

class Cercle {
    float rayon;

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public float surface() {
        return this.rayon * this.rayon * 3.14f;
    }
}