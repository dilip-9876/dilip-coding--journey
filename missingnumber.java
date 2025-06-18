import java.util.Scanner;
public class missingnumber{
    static int findmissingnumber (int []ar)
    {
        for(int i=0;i< ar.length;i++)
        {
            if(ar[i+1]-ar[i]!=1)
            {
                return ar[i]+1;
            }
        }
        return(ar[ar.length-1]+1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           int n=sc.nextInt();
           int []ar = new int[n];
           for(int i=0;i<ar.length;i++)
           {
               ar[i] = sc.nextInt();
           }
           int result = findmissingnumber(ar);
              System.out.println("The missing number is: " + result);
        }
    }

          
