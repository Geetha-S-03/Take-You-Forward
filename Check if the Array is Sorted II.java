class Solution {
    public boolean isSorted(int nums[]) {
        int nums[]={1,2,3,4,5};
                int len=nums.length;
                int c=0;
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]<=nums[i+1]){
                        c++;
                    }
        	    }
        	    if(c==len-1){
        	        return true;
        	    }
        	    else{
        	         return false;
        	    }
