public class Main{
    public static void main(String[] args){
        long[] e = new long[10];
        int index = 0;
        for (int i = 6; i <= 24; i += 2) {
            e[index] = i;
            index ++;
        }
        double[] x = new double[15];

        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 19.0 - 14.0;
        }
        double[][] e1 = new double[10][15];
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                e1[i][j] = calculateValue(e[i], x[j]);
            }
        }
        printFirstArray(e);
        printSecondArray(x);
        printMatrix(e1);
    }
    static double calculateValue(long e, double x) {
        if (e == 18) {
                return Math.PI * (Math.exp(x) / 3.0 - 3.0 / 4.0);
        }
        if (e == 8 || e == 10 || e == 14 || e == 16 || e == 24) {
            return Math.tan(Math.asin(Math.pow(Math.E, -Math.abs(x))));
        }
        else {
            return Math.pow((Math.pow((Math.sin(Math.pow(x, x / (1.0 - x)) + 4.0)) / (Math.log(Math.acos((x - 4.5) / 19.0))), 3.0) / 2.0), 2.0);
        }
    }
    static void printFirstArray(long[] e) {
        System.out.println("First array: ");

        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }
    static void printSecondArray(double[] x) {
        System.out.println("Second array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%10.3f", x[i]);
        }
        System.out.println();
    }
    static void printMatrix(double[][] e1) {
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                System.out.printf("%15.3f", e1[i][j]);
            }
            System.out.println();
        }
    }
}