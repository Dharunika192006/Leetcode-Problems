#include <stdlib.h>
int* findErrorNums(int* nums, int numsSize, int* returnSize) {
    *returnSize = 2;
    int* result = (int*)malloc(2 * sizeof(int));
    int* freq = (int*)calloc(numsSize + 1, sizeof(int));

    for (int i = 0; i < numsSize; i++) {
        freq[nums[i]]++;
    }

    for (int i = 1; i <= numsSize; i++) {
        if (freq[i] == 2) {
            result[0] = i; 
        } else if (freq[i] == 0) {
            result[1] = i;
        }
    }

    free(freq);
    return result;
}
