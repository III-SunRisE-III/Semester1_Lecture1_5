public class Main {
    public static void main(String[] args) {
        double[] a = new double[10];
        // final int n = 1000;
        int[] b = new int[]{0, 1, 2, 3, 4, 5, 9, 1, 2};
        int i = 1;
        for (i = 0; i < b.length; i++) {
            b[i] = i + 1;
            System.out.println(i + ": " + b[i]);
        }
        System.out.println(i);

    }
}
