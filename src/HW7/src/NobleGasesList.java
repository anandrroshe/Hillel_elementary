import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleGasesList {
    public static void main(String[] args) {


        String he = new String("Helium");
        String ne = new String("Neon");
        String ar = new String("Argon");
        String kr = new String("Krypton");
        String xe = new String("Xenon");
        String rn = new String("Radon");

        ArrayList<String> nobleGases = new ArrayList<>(Arrays.asList(he, ne, ar, kr, xe, rn));
        System.out.println(nobleGases);
        System.out.println("--------------------------");
        nobleGases.add(6, "Oganesson");
        System.out.println(nobleGases);
        System.out.println("---------------");
        nobleGases.remove(1);
        System.out.println(nobleGases);
        System.out.println("---------------");
        System.out.println(nobleGases.get(1));
        System.out.println("---------------");





    }
}
