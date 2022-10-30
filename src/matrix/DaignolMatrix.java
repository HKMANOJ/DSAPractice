package matrix;

import java.util.Arrays;

public class DaignolMatrix {
    public static void main(String[] args) {
        int [][]A={{1,2,3},{4,5,6},{7,8,9}};

        int N=A.length;
        int ans[] = new int[N*N];
        int row = 0;
        int h=0;

        int col = 0;

        while(col < N)

        {

            int r = row;

            int c = col;



            while(r < N && c >= 0)

            {

                ans[h++]=A[r][c];

                r++;

                c--;

            }

            col++;

        }

        col = N-1;

        row = 1;
        while(row < N)

        {

            int r = row;

            int c = col;

            while(r < N && c >= 0)

            {

                ans[h++]=A[r][c];

                r++;

                c--;

            }

            row++;

        }
        System.out.println(Arrays.toString(ans));
    }
}
