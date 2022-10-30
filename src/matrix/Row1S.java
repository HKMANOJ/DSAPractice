package matrix;

public class Row1S {
    public static void main(String[] args) {
        int[][] Arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int max = -1;
        int count = 0;
        int pr = 0;
        int n = Arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arr[i][j] == 1) count++;
            }

            if (pr < count) {
                pr = count;
                max = i;

            }
        }
        System.out.println(max);
    }
}
