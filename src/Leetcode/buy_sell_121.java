package Leetcode;

public class buy_sell_121 {
    public static void main(String[] args) {
    //int prices[]={5,2,6,1,4};
        int prices[]={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
    int maxprofit=0;
    int minprice=prices[0];
    for(int i=0;i<prices.length;i++){
        minprice=Math.min(minprice,prices[i]);
        int profit=prices[i]-minprice;
        maxprofit=Math.max(maxprofit,profit);
    }
    return maxprofit;
    }
}
