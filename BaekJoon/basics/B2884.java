import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        if(m<45) {
            if(h>0) h--;
            else h = 23;
            
            m+=15;
        } else {
            m-=45;
        }
        
        System.out.println(h + " " + m);
    }
}
