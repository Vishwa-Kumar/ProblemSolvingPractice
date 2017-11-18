package hackerRank;

public class MorganStanleyCodeathon2017 {

	static int maximizeProfit(int[] a, int[] b, int m, int k) {
        // Complete this function a is cryptoCurr conversion rate array  b is its units he can but with i bitcoin
        int profit[]=new int[a.length];
        int max=bitcoinWithDollarValue;
        for(int i=0;i<a.length;i++)
        {
            profit[i]=m*b[i]*a[i];
            if(profit[i]>max)
            {
                max=profit[i];
            }
        }
        
        return (max>bitcoinWithDollarValue)?max:bitcoinWithDollarValue;
    }
    static int bitcoinWithDollarValue=0;
    public static void main(String[] args) {
        int n = 10; // number of currrencies
        int m = 1; // amount of bitcoins ron has
        int k = 1000;  // con ration of bitcoin with dollar
        bitcoinWithDollarValue=k*m;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
        int[] b = {10 ,9 ,8 ,7 ,6 ,5 ,3 ,2 ,1 ,1};
       
        int result = maximizeProfit(a, b, m, k);
        System.out.println(result);
    }

}
