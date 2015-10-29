package practice_misc;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
				
        int index1=0;
        int index2=0;
        int value1=0;
        int value2=0;
                                  
        for(int j=0;j<nums.length;j++){
            int temp = target-nums[j];

            for(int x=j+1;x<nums.length;x++){
                if(nums[x]==temp){
                    value2 = nums[x];
                    value1 = nums[j];
                    j=1000000;
                    break;
                }    
            }
            
          }
        
        
        for(int k=0;k<nums.length;k++){
            if (nums[k]==value1){
                index1 = k+1;
                for(int d=k+1;d<nums.length;d++) {   
                	if (nums[d]==value2){
                		index2 = d+1;
                		break;
                	}	
               	}	
            break;
            }
        }
       
    int result[] = {index1,index2};
    
    return result;
            // 1,2,3,4,7,9,11,12,13
    }
	
	public static void main(String a[]){
		
		TwoSum t = new TwoSum();
		int [] nums = {-3,4,3,90}; 
		int result[] = t.twoSum(nums, 0);
		System.out.println(result[0]+" "+result[1]);
		
	}
}
