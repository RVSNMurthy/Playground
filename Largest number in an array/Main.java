import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int max_no;
      if(arr[0] > arr[1])
      {
           max_no = arr[0];
      }
      else
         {
           max_no = arr[1];
         }
      for(int idx = 0; idx <= arr_size - 1; idx++)
          {
            if(max_no < arr[idx])
            {
              max_no = arr[idx];
            }
          }
         System.out.println(max_no);
            
    }
}