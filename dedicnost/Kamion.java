package dedicnost;

public class Kamion extends Auto {
    private final String spotreba;

    public Kamion(String znacka, String spotreba, int maxRychlost, String palivo) {
        super(znacka, maxRychlost, palivo);
        this.spotreba = spotreba;
    }

    public String getSpotreba() {
        return spotreba;
    }

    @Override
    public void getStats() {

        System.out.println("Značka kamionu: " + znacka);
        System.out.println("Maximální rychlost kamionu: " + maxRychlost);
        System.out.println("Palivo kamionu: " + palivo);
        System.out.println("Spotřeba kamionu: " + spotreba);
    }
}
