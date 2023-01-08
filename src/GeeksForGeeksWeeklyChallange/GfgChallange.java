package GeeksForGeeksWeeklyChallange;

public class GfgChallange {
   static int solve(String s, int K)
    {
        // code here
        char[] ch=s.toCharArray();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='1')
            {
                ans++;
                int j=i-1;
                int k=K;
                while(j>=0 && k>0){
                    if(ch[j]=='1' || ch[j]=='x')break;
                    ch[j]='x';
                    ans++;
                    j--;
                    k--;
                }
                j=i+1;
                k=K;
                while(j<s.length() && k>0){
                    if(ch[j]=='1')break;
                    ch[j]='x';
                    ans++;
                    j++;
                    k--;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "0010100";
        int K = 1;
        System.out.println(solve(s,K));
    }
}
