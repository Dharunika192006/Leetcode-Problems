#include <stdlib.h>
#include <string.h>

int evalRPN(char** tokens, int tokensSize) {
    int* stack = (int*)malloc(tokensSize * sizeof(int));
    int top = -1;
    for (int i = 0; i < tokensSize; i++) {
        char* s = tokens[i];
        if ((strlen(s) == 1) && (s[0] == '+' || s[0] == '-' || s[0] == '*' || s[0] == '/')) {
           
            int op2 = stack[top--];
            int op1 = stack[top--];
            if (s[0] == '+') stack[++top] = op1 + op2;
            else if (s[0] == '-') stack[++top] = op1 - op2;
            else if (s[0] == '*') stack[++top] = op1 * op2;
            else if (s[0] == '/') stack[++top] = op1 / op2; 
        } else {
            stack[++top] = atoi(s);
        }
    }
    int result = stack[0];
    free(stack);
    return result;
}
