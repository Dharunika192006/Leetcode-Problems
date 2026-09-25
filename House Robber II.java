int rob(int* nums, int numsSize) {
   if (numsSize == 0) return 0;  
    if (numsSize == 1) return nums[0];  
    int robLinear(int* arr, int size) {
        int prev1 = 0;  
        int prev2 = 0;  
        for (int i = 0; i < size; i++) {
            int temp = prev1;  
            prev1 = (prev2 + arr[i] > prev1) ? prev2 + arr[i] : prev1;
            prev2 = temp; 
        }
        return prev1;  
    }
    int option1 = robLinear(nums, numsSize - 1); 
    int option2 = robLinear(nums + 1, numsSize - 1);  
    return (option1 > option2) ? option1 : option2;
}
