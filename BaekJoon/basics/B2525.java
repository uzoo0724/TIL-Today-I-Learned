import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시
        int m = sc.nextInt(); // 분
        int o = sc.nextInt(); // 필요한 시간
        
        if(o>=60){
            m += (o%60);
            h += (o/60);  
        } else {
            m+=o;
        }
        
        if(m>=60) {
            h+=(m/60);
            m%=60;
        }
        
        if(h>=24) { h-=24; }
        
        System.out.println(h + " " + m);
    }
}
