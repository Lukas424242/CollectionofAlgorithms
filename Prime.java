public class Sieb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=23;
        // wenn nur bis n, dann werden zahlen vergessen
        int[] array = new int[n+1];
        for (int i = 2; i < n +1; i++) {
            array[i] = i;
            //System.out.println(i);
        }
        for (int i = 2; i < Math.sqrt(n); ++i) {

            for (int j = 0; j < array.length; j++) {
                if (i != array[j]) {
                    if (array[j] % i == 0) {
                        array[j] = 0;
                    }
                }
            }

        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 0) {
               System.out.println(array[i]);
            } else {
                continue;
            }
        }

    }
    public static void printprimes(int n){
        int[] array = new int[n+1];
        for (int i = 2; i < n +1; i++) {
            array[i] = i;
            //System.out.println(i);
        }
        for (int i = 2; i < Math.sqrt(n); ++i) {

            for (int j = 0; j < array.length; j++) {
                if (i != array[j]) {
                    if (array[j] % i == 0) {
                        array[j] = 0;
                    }
                }
            }

        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 0) {
               System.out.println(array[i]);
            } else {
                continue;
            }
        }
        
    }

    
}