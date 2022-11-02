public class TSPV2 {

    /**
     * @param args the command line arguments
     */
    // staitisch nur einmal in der klasse, das gibt es nur einmal in der klasse
    static ArrayList<Double> streckenliste = new ArrayList<>();
    static Double[] pAnfang;
    Point p = new Point(2, 3);

    // final double[] startpunkt = new double[2];
    // Main Method
    
    public static void main(String[] args) {
        ArrayList<Double[]> punkte = new ArrayList<>(10);

        punkte.add(new Double[]{1.0, 1.0});
        punkte.add(new Double[]{2.0, 1.0});
        punkte.add(new Double[]{1.0, 2.0});
        punkte.add(new Double[]{65.0, 2.0});
        punkte.add(new Double[]{64.0, 123.0});
        punkte.add(new Double[]{11.0, 40.0});
        punkte.add(new Double[]{42.0, 69.0});
        
        
        punkte.add(new Double[]{69.0, 11.0});
        punkte.add(new Double[]{43.0, 17.0});
        /punkte.add(new Double[]{63.0, 80.0});
        punkte.add(new Double[]{64.0, 80.0});

        rec2(punkte);
    }
// a b c d
    // b d c
    //
    public static ArrayList<Double> rec2(ArrayList<Double[]> p) {
        // Punkt 0 als Anfangspunkt festlegen
        pAnfang = p.get(0);

        // Punkt 0 aus weiteren Punkten löschen
        ArrayList<Double[]> punkte = new ArrayList<>(p);
        punkte.remove(0);

        rec(0, pAnfang, punkte);

        return new ArrayList<>(streckenliste);
    }

    public static void rec(double weg, Double[] letzterPunkt, ArrayList<Double[]> p) {

        if (p.isEmpty()) {
            // zum Anfang zurückkehren
            weg = weg + p2p(letzterPunkt, pAnfang);

            // weg speichern
            streckenliste.add(weg);

            System.out.printf("Ende mit Weglänge + zum Anfang %f \n", weg);
        } else {
            // Multi Threading hier einabeun für später
            
            for (int i = 0; i < p.size(); i++) {
                Double[] hier = p.get(i);

                //   System.out.printf("Von (%f, %f) nach (%f, %f) \n", letzterPunkt[0], letzterPunkt[1], hier[0], hier[1]);
//                ArrayList<Double[]> punkte = (ArrayList<Double[]>) p.clone();
                ArrayList<Double[]> punkte = new ArrayList<>(p);
                punkte.remove(i);

                rec(weg + p2p(letzterPunkt, hier),
                        hier,
                        punkte
                );
            }
        }

    }

    public static double p2p(Double[] p1, Double[] p2) {
        return Math.sqrt(
                Math.pow(p1[0] - p2[0], 2)
                + Math.pow(p1[1] - p2[1], 2)
        );
    }
}
