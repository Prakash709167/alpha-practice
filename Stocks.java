import java.util.*;
public class Stocks {
    public static void CalStackValue(int n[]){
        int costprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0 ; i<n.length;i++){
            if(costprice<n[i]){
                int profit = n[i]-costprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                costprice = n[i];
            }
        }
        System.out.println("Maximum profit : "+ maxprofit);
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int days = in.nextInt();
        int price[] = new int[days];
        System.out.println("Enter the price of all days : ");
        for(int i =0; i<days; i++){
            price[i]=in.nextInt();
        }
        System.out.println("price of all days : ");
        System.out.print("{");
        for(int i =0; i<days; i++){
            System.out.print(price[i]+" ,");
        }
        System.out.print("}");
        System.out.println();
        CalStackValue(price);
    }
}