class Solution {
    public int maxProfit(int[] prices) {
        int totalprofit = 0 , bestbuy = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>bestbuy){
                totalprofit = Math.max(totalprofit,prices[i]-bestbuy);
            }
            bestbuy = Math.min(bestbuy,prices[i]);
        }
        return totalprofit;
    }
}