package Bitwise;

public class Bit1 {
    static int norOperation(int [] n){
        int ans=0;
        for (int i = 0; i < n.length; i++) {
            ans ^=n[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int ans=norOperation(arr);
        System.out.println(ans);
    }
}
