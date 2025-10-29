public class Chien extends Animal {

    Chien(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public void bruit() {
        System.out.println("WAFFFFFFF");
    }

    @Override
    public void soinQuotidient() {
        System.out.println("Brosser");
    }
}
