public class SortZeroOneTwo {

    public static void main(String[] args) {

        int[] nums = {1,1,2,0,2,1,0,1,1,0,2,0,1};

        int i = 0 , j = 0 , k = nums.length-1;

        while(j<=k){
              if(nums[j]==0){
                  swap(nums,i,j);
                  i++;
                  j++;
              }else if(nums[j]==1){
                  j++;
              }else{
                  swap(nums,j,k);
                  k--;
              }
        }

        for(int num:nums)
        {
            System.out.print(num+" ");
        }

    }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
