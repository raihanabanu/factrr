# factrr
import java.util.Scanner;


public class Powero {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int mod=0;
      int sum=0;
      int b=0;
      int output=0;
      while(num>0){
    	  mod=num%10;
    	  sum=(sum*10)+mod;
    	  num=num/10;
    	  }
    	  System.out.println(sum);
    	  
	}
}
      
