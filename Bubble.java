class Bubble {
    public static void main(String args[]) {
        int nums[] = {99, -46, 56, 1345, -99, -654, 8765, 43, 65, 87878};
        int size, a, b, t;
        size = nums.length;
                
        for(int i = 0; i < size ; i++) 
            System.out.println("Unsorted: " + nums[i]);
            
        for(a = 1; a < size; a++) {
            for(b = size - 1; b >= a; b--){
                if(nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
            
        }
        for(int i = 0; i < size; i++) 
            System.out.println("Sorted: " + nums[i]);
    }
}