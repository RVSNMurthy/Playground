import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int temp = n;
      int sum = 0;
      for(temp = n; temp > 0; temp = temp/10)
      {
        	int fact = 1;
        	int rem = temp % 10;
            for(int i=1; i <= rem; i++)
              {
                 fact = fact * i;
      		  }
        	 sum = sum + fact;
      }
       if( n == sum)
         System.out.println("Yes");
      else
        System.out.println("No");
	}
}