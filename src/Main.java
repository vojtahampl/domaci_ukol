import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String name;
        String prijmeni;
        LocalDate datumNarozeni;
        int pocetSjednanychSmluv;
        int prodaneMrkveKg;
        String sidlo;
        String spz;
        Double spotreba;
        String ipAdresa;

        name = "Honza";
        prijmeni = "Nejedlý";
        datumNarozeni = LocalDate.of(1995, 04, 23);
        pocetSjednanychSmluv = 958;
        prodaneMrkveKg = 98754;
        sidlo = "Brno";
        spz = "6AS 2565";
        spotreba = 4.5;
        ipAdresa = "192.168.48.39";

        //Použití proměnné
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+ prodaneMrkveKg/pocetSjednanychSmluv);
    }
}