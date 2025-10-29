public class Lapin extends Animal {
    Lapin(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public void bruit() {
        System.out.println("pf ! pf !");
    }

    @Override
    public void soinQuotidient() {
        System.out.println("Donner des carottes");
    }
}
