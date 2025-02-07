class TwoLargestSmallest
{
    public static void main(String args[])
    {
        int arr[]=new int[]{5,3,10,12,13};
        int min1=arr[0];
        int min2=0;
        int max1=arr[0];
        int max2=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2 =max1;
                max1 =arr[i];
                
            }
            if(arr[i]<min1)
            {
                min2 =min1;
                min2=arr[i];
                
            }
        }
        System.out.println("max1= " +max1+"max2 =" +max2);
        System.out.println("min1= " +min1+"min2 =" +min2);
    }
}