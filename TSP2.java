// Other Version, here we generate all permutations of an array, and loop thorugh them
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author lukasschroeter
 */
public class TSPIterativ {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Double[]> moeglichkeiten = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double[]> punkte = new ArrayList<>(10);

        punkte.add(new Double[]{1.0, 1.0});
        punkte.add(new Double[]{2.0, 1.0});
        punkte.add(new Double[]{1.0, 2.0});
        System.out.println(fuk(4));

        // du warst dumm, du musst zum Startpunkt natürlich zurückkehren
        ArrayList<Double> strecken = new ArrayList<>();
        double gesamat = 0;
        double c = 0;

        for (int l = 1; l < punkte.size(); l++) {
            gesamat = punkte2(punkte.get(l - 1), punkte.get(l));
            c = c + gesamat;

        }
        Double[] ersterpunkt = punkte.get(0);
        Double[] letzterpunkt = punkte.get(punkte.size() - 1);
        double b = punkte2(ersterpunkt, letzterpunkt);
        //System.out.println(gesamat); das ist nicht alles, nur eine
        System.out.println(c + b); // das ist die gesamte strekce
        strecken.add(gesamat);

        for (int i = 0; i < fuk(punkte.size() - 1); i++) {

            // Strecken zwischen den Punkten im Array berechnen
        }
        // entweder über getter oder object.varname

        System.out.println("hi" + reversedFuck(24));
        ArrayList<Double> v = new ArrayList<>();
        v.add(1.0);
        v.add(3.0);
        v.add(6.0);
        v.add(22.0);
        permute(punkte, 0);
    }

    public static int fuk(int c) {
        if (c == 1) {
            return c;
        } else {
            return fuk(c - 1) * c;
        }
    }

    public static double punkte2(Double[] b, Double[] c) {
        double aStrecke = Math.abs(b[0] - c[0]);
        double bStrecke = Math.abs(b[1] - c[1]);
        double zwischenergebnis;
        zwischenergebnis = Math.pow(aStrecke, 2) + Math.pow(bStrecke, 2);
        double finalergebnis = Math.sqrt(zwischenergebnis);

        return finalergebnis;

    }

    public static Double[] kombinationen(Double array[]) {
        // Erstes Element ist fixed
        // als Zähler nehmen wir die Variable i, Schleifenvariable
        ArrayList<Double[]> punkte = new ArrayList<>(10);

        // Aufgabe ist es alle Punkte Kombinationen in einem Array zu schreiben 
        for (int i = 0; i < fuk(punkte.size() - 1); i++) {

        }
        return array;

    }

    public static void permute(java.util.ArrayList<Double[]> arr, int k) {

        for (int i = k; i < arr.size(); i++) {
            java.util.Collections.swap(arr, i, k);
            permute(arr, k + 1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            //System.out.println(java.util.Arrays.toString(arr.toArray()));
            int zähler = 0;
            int arrlength = reversedFuck(arr.size());
            System.out.println("Umbruch");
            moeglichkeiten.add(new Double[]{});

            

        }

    }

    public static int reversedFuck(int zahl) {
        int produkt = 1;
        for (int i = 1; i < zahl; i++) {
            produkt = produkt * i;
            if (zahl == produkt) {
                return i;

            }

        }
        return 0;

    }

}
