public class FactorPrinter {
    public static void main(String args[]) {
        System.out.println ( printFactors ( -1 ) );

    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println ( "Invalid value" );

        int ostatok = 0;
        //int[] myArray1 = new int[first];
        //int[] myArray2 = new int[second];

        for (int i = 1; i <= number; i++) {
            ostatok = number % i;
            if (ostatok == 0) {
                System.out.println ( i );
            }
        }
        return ;
    }
}