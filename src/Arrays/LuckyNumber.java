package Arrays;

public class LuckyNumber {
    public static boolean isLucky(int n)
    {
        // Your code here
        for(int i=2;i<=n;i++){
            if(n%i==0)return false;
            n=n-(n/i);
        }
        return true;
    }
    public static void main(String[] args) {
       int n=5;
        System.out.println(isLucky(n));
    }
}
