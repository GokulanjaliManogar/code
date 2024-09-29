import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String s=scanner.nextLine();
        int n=scanner.nextInt();
        int[] startIndex=new int[n];
        for (int i=0;i<n;i++) {
            startIndex[i]=scanner.nextInt();
        }
        
        int m=scanner.nextInt();
        int[] endIndex=new int[m];
        for (int i=0;i<m;i++) {
            endIndex[i]=scanner.nextInt();
        }
        
        int[] result=new int[n];
        for (int i=0;i<n;i++) {
            int start=startIndex[i]-1;
            int end=endIndex[i]-1;
            result[i]=countFrogs(s,start,end);
        }
        
        for (int count:result) {
            System.out.println(count);
        }
        
        scanner.close();
    }

    private static int countFrogs(String s,int start,int end) {
        int firstBar=s.indexOf('|',start);
        int lastBar=s.lastIndexOf('|',end);
        
        if(firstBar==-1||lastBar==-1||firstBar>=lastBar) {
            return 0;
        }
        
        return countStars(s,firstBar,lastBar);
    }

    private static int countStars(String s,int start,int end) {
        int count=0;
        for (int i=start;i<=end;i++) {
            if (s.charAt(i)=='*') {
                count++;
            }
        }
        return count;
    }
}
