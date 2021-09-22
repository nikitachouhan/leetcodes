// With HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
          
        HashMap<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            
           int key = nums[i];
           if(arrayMap.get(key) != null && arrayMap.get(key) == 1){
               
               return true;
           }
            
           arrayMap.put(key, 1);
        }
        
        return false;
    }
}

// With Set
class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
