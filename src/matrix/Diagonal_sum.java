package matrix;

public class Diagonal_sum {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;

        for(int i=0; i<matrix.length; i++){
            sum=sum+matrix[i][i]+matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
    }
}
