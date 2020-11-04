import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n/100,y=n%10;
      System.out.println(x+y);
      return;
	}
}