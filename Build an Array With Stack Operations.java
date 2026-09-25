#include <stdlib.h>
#include <string.h>
char** buildArray(int* target, int targetSize, int n, int* returnSize) {
    char** result = (char**)malloc(2 * n * sizeof(char*));
    int count = 0;
    int targetIdx = 0;
    for (int i = 1; i <= n && targetIdx < targetSize; i++) {
        result[count++] = strdup("Push");
        if (i == target[targetIdx]) {
            targetIdx++;
        } else {
            result[count++] = strdup("Pop");
        }
    }

    *returnSize = count;
    return result;
}
