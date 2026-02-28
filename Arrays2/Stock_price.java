public class Stock_price {
    public static int buysellprice(int price[]){
        int buyprice =Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){ //Profit
                int profit =price[i]-buyprice;  //Todays Profit
                maxProfit = Math.max(maxProfit ,profit);
            }else{
                buyprice =price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int profit = buysellprice(price);
        System.out.print(profit);
    }
}
