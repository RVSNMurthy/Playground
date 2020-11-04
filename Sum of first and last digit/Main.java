import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last_digit=n%10;
      while(n>=10)
        n/=10;
      int first_digit=n;
      int sum=first_digit+last_digit;
      System.out.println(sum);
      
	    // Type your code here
	}
}