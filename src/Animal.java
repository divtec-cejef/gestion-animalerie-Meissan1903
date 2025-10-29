abstract class Animal {
    private String nom;
    private int age;
    private EtatSante sante;

    Animal(String nom, int age, EtatSante sante) {
        this.nom = nom;
        this.age = age;
        this.sante = sante;
    }

    public abstract void bruit();

    public abstract void soinQuotidient();
}
