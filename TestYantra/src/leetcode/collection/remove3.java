package leetcode.collection;
import java.util.*;
	 
		 public class remove3
		 {
		 public int removeElement(int[] nums, int val) {
		      int t=0;
		         for(int i = 0 ; i < nums.length ; i++){
		            if(nums[i]!=val){
		                nums[t]=nums[i];
		                    t++;
		            }
		        }
		        return t;  
		    }

		public static void main(String[] args) 
		{
			int[] nums =  {0,1,2,2,3,0,4,2};
			int val = 2; 
			int[] expectedNums = new int [2]; 
			                           
			remove3 s=new remove3();
			int k = s.removeElement(nums, val); 

			assert k == expectedNums.length;
			Arrays.sort(nums, 0, k);
			for (int t = 0; t < k; t++) 
			{
			    assert nums[t] == expectedNums[t];
			    System.out.println(nums[t]+" ");
			}

		}

}
