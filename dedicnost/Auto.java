package dedicnost;

public class Auto {

    final String znacka, palivo;
    final int maxRychlost;

    public Auto(String znacka, int maxRychlost, String palivo) {
        this.znacka = znacka;
        this.maxRychlost = maxRychlost;
        this.palivo = palivo;
    }

    public String getZnacka() {
        return znacka;
    }

    public int getMaxRychlost() {
        return maxRychlost;
    }

    public String getPalivo() {
        return palivo;
    }

    public void getStats() {

        System.out.println("Značka auta: " + znacka);
        System.out.println("Maximální rychlost auta: " + maxRychlost);
        System.out.println("Pohon auta: " + palivo);
    }
}
