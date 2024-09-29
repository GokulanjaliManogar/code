import java.util.Scanner;
class code1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] prices= new int[n];
        for (int i=0;i<n;i++) {
            prices[i]=scanner.nextInt();
        }
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int price:prices) {
            if (price<minPrice) {
                minPrice=price;
                   
            } 
            else if (price-minPrice>maxProfit) {
                maxProfit= price-minPrice;
            }
        }
            System.out.println(maxProfit);
        }
}