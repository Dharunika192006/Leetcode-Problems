/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersection(int** nums, int numsSize, int* numsColSize, int* returnSize) {
    int h[1001] = {0};
    int count = 0;
    int *ans = malloc(4004);
    for(int i=0;i<numsColSize[0];i++){
        h[nums[0][i]]++;
    }
    for(int i=1;i<numsSize;i++)
    {
        for(int j=0;j<numsColSize[i];j++)
        {
            if(h[nums[i][j]]==i)  h[nums[i][j]]++;
        }
    }
    for(int i=0;i<1001;i++){
        if(h[i]==numsSize) ans[count++] = i;
    }
    *returnSize = count;
    return ans;
}
