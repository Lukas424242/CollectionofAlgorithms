// Working with backtracking

public class SudokuV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] boolfeld = new boolean[9][9];
        int[][] eingabefeld = {{0, 3, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 0, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 0, 6, 0, 0, 0},
        {4, 0, 0, 8, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 2, 0, 0, 0, 0},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 0, 0, 0, 7, 0}};

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if (eingabefeld[i][k] == 0) {
                    boolfeld[i][k] = false;
                } else {
                    boolfeld[i][k] = true;
                }

            }

        }
        // wenn eine feste Zahl da ist, wird die als true repräsentiert, wenn true, dann nicht
        // manipulieren
        int[][] eingabefeld2 = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        int[][] eingabefeld3 = {{5, 5, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 5, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {5, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        // x=3 y=1
        int[][] h
             = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {0, 0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {0, 0, 9, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 0, 0, 0, 0, 0},
                {0, 0, 5, 0, 0, 0, 0, 0, 0}};

        //System.out.println(isittruegesamtesFeld(eingabefeld3));
        // Funktioniert noch nicht
        System.out.println(isittrueeingeschränkt(h, 0, 2));

    }

    public static boolean isittruegesamtesFeld(int[][] b) {
        // Seite 
        for (int i = 0; i < 9; i++) {

            int[] c = new int[9];

            for (int j = 0; j < 9; j++) {

                if (b[i][j] == 0) {
                    return false;

                }

                int d = b[i][j] - 1;
// oder mit booleans und xor
                c[d]++;
                if (c[d] > 1) {
                    return false;

                }

            }
        }

        // unten
        for (int i = 0; i < 9; i++) {

            int[] c = new int[9];

            for (int j = 0; j < 9; j++) {

                if (b[i][j] == 0) {
                    return false;

                }

                int d = b[i][j] - 1;

                c[d]++;
                if (c[d] > 1) {
                    return false;

                }

            }
        }

        return true;

    }

    public static boolean isittrueeingeschränkt(int[][] b, int x, int y) {
        // wir checken jetzt, ob bei der Position, die Reihen und spalten
        // diese eingaben zulassen 
        // Vertikal
        int[] boolarray = new int[9];
        for (int i = 0; i < 9; i++) {
            System.out.print(b[x][i]);

            int d = b[x][i];
            if (d == 0) {
                continue;
            } else {
                d = d - 1;

                boolarray[d]++;

                if (boolarray[d] > 1) {
                    return false;

                }

            }
        }

        System.out.println();
        int[] boolarray2 = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.print(b[i][y]);

            int d = b[i][y];
            if (d == 0) {
                continue;
            } else {

                d = d - 1;

                boolarray2[d]++;

                if (boolarray2[d] > 1) {
                    return false;

                }

            }

        }
        return true;
    }

    public int[][] rekursivgoesbrrr(int[][] b, boolean[][] boolfeld) {

        if (isittruegesamtesFeld(b)) {
            return b;

        } else {
            // Methode nur für diesen Wertbereich
            if(){
                
            }

        }
        return b;
    }

    //  public boolean[][] arraytransform(int[][]b){
    //  }
}
