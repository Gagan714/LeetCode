class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int output[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            output[i]=power(i,i+k-1,nums);
        }
        return output;
    }
    public int power(int start,int end,int []arr){
        if(start==end){
            return arr[start];
        }
        for(int i=start;i<end;i++){
            if(arr[i]>=arr[i+1] || arr[i]-arr[i+1]!=-1){
                return -1;
            }
        }
        return arr[end];
    }
}
