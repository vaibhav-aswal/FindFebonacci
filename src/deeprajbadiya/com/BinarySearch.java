import java.util.*;
class BinarySearch
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int l = sc.nextInt();
        System.out.println("Enter terms");
        int[] arr = new int[l];
        for(int i = 0; i<l;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        int start = 0;
        int end = l-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target<arr[mid])
               end = mid - 1;
            else if(target > arr[mid])
               start = mid+1;
            else
            {
               System.out.println(mid+1);
               break;
            }
        }
    }
}