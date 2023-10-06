public class zadacha2 {
    public static void main(String[] args) {
        int n;

        int d = 0;
        double[] array = { 9, 4, 5, 6, 7,9,8,6,5};
        double[] doublesArray = array;

        try {
            double catchedRes1 = doublesArray[8] / d;

//            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);

        }
        throw new NewException2(doublesArray);
    }

}
