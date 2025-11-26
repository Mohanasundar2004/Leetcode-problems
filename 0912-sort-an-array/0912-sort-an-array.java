class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return nums;
        }
        int mid=n/2;
        int[] l1=new int[mid];
        int[] l2=new int[n-mid];
        for(int i=0;i<mid;i++){
            l1[i]=nums[i];
        }
        for(int i=mid;i<n;i++){
            l2[i-mid]=nums[i];
        }
        sortArray(l1);
        sortArray(l2);
        mergesort(nums,l1,l2);
        return nums;
    }
    public static void mergesort(int[] nums,int[] l1,int[] l2){
        int i=0,j=0,k=0,n=l1.length,m=l2.length;
        while(i<n && j<m){
            if(l1[i]<=l2[j]){
                nums[k++]=l1[i++];
            }
            else{
                nums[k++]=l2[j++];
            }
        }
        while(i<n){
            nums[k]=l1[i];
            k++;
            i++;
        }
        while(j<m){
            nums[k]=l2[j];
            k++;
            j++;
        }
    }
}