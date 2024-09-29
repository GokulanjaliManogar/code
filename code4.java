import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        scanner.nextLine(); 
        String[] B=new String[N];
        
        for (int i=0;i<N;i++) {
            B[i]=scanner.nextLine();
        }
        
        Map<String,Integer>colorCount=new HashMap<>();
        
        for (String color:B) {
            colorCount.put(color,colorCount.getOrDefault(color,0)+1);
        }
        for (String color:B) {
            if (colorCount.get(color)%2!=0) {
                System.out.println(color);
                return;
            }
        }
        
        System.out.println("All are even");
    }
}
