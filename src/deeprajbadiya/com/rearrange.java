import java.util.*;
class rearrange
{
    public static void main()
    {
        System.out.print('\u000C');
        
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[4];
        int z;
        System.out.println("enter length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    z = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=z;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}