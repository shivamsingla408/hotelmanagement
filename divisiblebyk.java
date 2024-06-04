import java.util.*;
class divisiblebyk{
    public static void findno(int arr[],int n,int k){
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]%k==0)count++;
            int sum=arr[i];
            for(int j=i+1;j<n;j++){
                  sum+=arr[j];
                  if(sum%k==0)count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("enter value of elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter value of k");
        int k = sc.nextInt();
        sc.close();

        findno(arr,n,k);
    }
}