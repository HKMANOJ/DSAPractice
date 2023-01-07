package queue;

public class PetrolTravel {
    static  int tour(int petrol[], int distance[])
    {
        // Your code here
        int start=0;
        int curr=0;
        int prev=0;
        for(int i=0;i<petrol.length;i++){
            curr+=(petrol[i]-distance[i]);
            if(curr<0){
                start=i+1;
                prev+=curr;
                curr=0;
            }
        }
        return((prev+curr)>=0)?(start):-1;
    }

    public static void main(String[] args) {
       int N = 4;
       int[] Petrol = {4 ,6, 7, 4};
        int []Distance = {6 ,5 ,3, 5};
        System.out.println(tour(Petrol,Distance));
    }
}
