package matrix;

public class CornerElment {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int c= matrix.length;
        int r=matrix.length;
        for (int i = 0; i <c; i++) {
            System.out.print(matrix[0][i]+" ");
        }
        for (int i = 1; i < r; i++) {
            System.out.print(matrix[i][c-1]+" ");
        }
        for (int i = c-2; i >=0 ; i--) {
            System.out.print(matrix[r-1][i]+" ");
        }
        for (int i = r-2; i >=1 ; i--) {
            System.out.print(matrix[i][0]+" ");
        }
    }
}
