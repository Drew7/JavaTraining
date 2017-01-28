class MinMax {
    public static void main(String args[]) {
        int nums[] = {99, -46, 56, 1345, -99, -654, 8765, 43, 65, 87878};
        int min, max;
        
        min = max = nums[0];
        for(int i = 1; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}