public class Chat extends Animal{
    Chat(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public void bruit() {
        System.out.println("MIAUUUUUUUUU");
    }

    @Override
    public void soinQuotidient() {
        System.out.println("Litière");
    }
}
