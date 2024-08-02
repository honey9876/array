public class Stocks {  
    public static int buySell(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] =  {1, 2, 3, 4, 5 , 6 ,7, 8 ,9,};
        System.out.println(buySell(prices));
    }
}
