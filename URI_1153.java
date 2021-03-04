import java.io.IOException;
import java.util.Scanner;

 
public class URI_1153{
    
    public static int fat(int n) {
    	

        if (n == 0 || n == 1) {return 1; 
        }else {
        	return n*fat(n-1);
        }
    }
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fat(n));
 
    }
 
}
