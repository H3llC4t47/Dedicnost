package dedicnost;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Škoda Nevadee", 169, "Elektro");
        Kamion kamion = new Kamion("Iveco TT nikdy bych to nechtěl", "40l/100km", 120, "Diesel");
        Motorka motorka = new Motorka("Kawasaki", 230, "Benzín", 2, 130000);

        auto.getStats();
        System.out.println("");
        motorka.getStats();
        System.out.println("");
        kamion.getStats();
    }
}
