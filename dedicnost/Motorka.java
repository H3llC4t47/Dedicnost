package dedicnost;

public class Motorka extends Auto {
    private final int pocetVyfuku, cena;

    public Motorka(String znacka, int maxRychlost, String palivo, int pocetVyfuku, int cena) {
        super(znacka, maxRychlost, palivo);
        this.pocetVyfuku = pocetVyfuku;
        this.cena = cena;
    }

    public int getPocetVyfuku() {
        return pocetVyfuku;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public void getStats() {

        System.out.println("Značka motorky: " + znacka);
        System.out.println("Maximální rychlost motorky: " + maxRychlost);
        System.out.println("Palivo motorky: " + palivo);
        System.out.println("Pocet výfuků na motorce: " + pocetVyfuku);
        System.out.println("Cena motorky: " + cena);
    }
}
