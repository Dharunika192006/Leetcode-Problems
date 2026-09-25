int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int maxc=0;
    int curc=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==1){
            curc++;
            if(curc>maxc){
                maxc=curc;
            }
        }
            else{
                curc=0;
            }
    }
    return maxc;
}
