import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int f=n/100,s=(n/10)%10,l=n%10,rev;
    rev=l*100+s*10+f;
    System.out.println(rev);
    return;
  }
}