import java.util.Scanner;
import static java.lang.System.out;

public class Paswoord {
    String naam;
    String paswoord;

    public static void main(String[] args) {
        Paswoord combinatieNaamPaswoord1 = new Paswoord();
        Paswoord combinatieNaamPaswoord2 = new Paswoord();

        combinatieNaamPaswoord1.naam = "Alex";
        combinatieNaamPaswoord1.paswoord = "geheim";

        combinatieNaamPaswoord2.naam = "Piet";
        combinatieNaamPaswoord2.paswoord = "puk";

        out.println("Voer je gebruikersnaam in:");
        var keyboard = new Scanner(System.in);
        String naamGebruiker = keyboard.next();

        if (naamGebruiker.equals(combinatieNaamPaswoord1.naam)) {
            out.println("Voer je paswoord in:");
             String paswoordGebruiker = keyboard.next();
             if (paswoordGebruiker.equals(combinatieNaamPaswoord1.paswoord)) {
                 out.println("Je bent ingelogd.");
             } else {
                 out.println("Verkeerd wachtwoord!");
             }
        } else {
            out.println("Onbekende gebruikersnaam!");
        }
        keyboard.close();


    }
}
