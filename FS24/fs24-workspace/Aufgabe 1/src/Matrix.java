public class Matrix {

    public static int countAssimilated(int[][] matrix) {
        // TODO: Implementieren Sie diese Methode.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("countAssimilated([[10, 10, 10], [10, 10, 10], [10, 10, 10]]): " +
                countAssimilated(new int[][]{{10, 10, 10}, {10, 10, 10}, {10, 10, 10}}));
        System.out.println("countAssimilated([[5, 10, 3], [6, 9, 6], [3, 3, 15]]): " +
                countAssimilated(new int[][]{{5, 10, 3}, {6, 9, 6}, {3, 3, 15}}));
        System.out.println("countAssimilated([[4, 7, 13], [-2, -12, 32], [20, 15, -8], [17, 3, 1111]]): " +
                countAssimilated(new int[][]{{4, 7, 13}, {-2, -12, 32}, {20, 15, -8}, {17, 3, 1111}}));
        System.out.println("countAssimilated([[1, 2, 3, 4, 5, 6], " +
                "[7, 8, 9, 10, 11, 12], " +
                "[13, 14, 15, 16, 17, 18], " +
                "[19, 20, 21, 22, 23, 24], " +
                "[25, 26, 27, 28, 29, 30]]): " +
                countAssimilated(new int[][]{{1, 2, 3, 4, 5, 6},
                        {7, 8, 9, 10, 11, 12},
                        {13, 14, 15, 16, 17, 18},
                        {19, 20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29, 30}}));
    }
}
