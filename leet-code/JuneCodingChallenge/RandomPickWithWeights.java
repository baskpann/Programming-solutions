class Solution {

    private List<Integer> list;
    private Random random;
    private int sum;
    
    public Solution(int[] w) {
      
        list   = new ArrayList<>();
        random = new Random();
        sum    = 0;
        
        list.add(0); 
        
        for(int num : w){
            
            sum += num;
            list.add(sum);
        }
    }
    
    public int pickIndex() {
        
        int index = Collections.binarySearch(list, random.nextInt(sum));
        return index >= 0? index : -(index + 2);  
    }
}
