package matrix;

import java.util.HashSet;

public class SetMatrixZeros {
    public static void main(String[] args) {
      int[][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};
      int r=matrix.length;
      int c=matrix[0].length;
      HashSet<Integer> rows=new HashSet<>();
      HashSet<Integer> cols=new HashSet<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        }
    }

