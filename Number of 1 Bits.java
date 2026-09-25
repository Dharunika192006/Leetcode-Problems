int hammingWeight(int n) {
    int bin[32];
    int i=0,c=0;
    while(n>0){
        bin[i]=n%2;
        if(bin[i]==1){
            c++;
        }
        n=n/2;
        i++;
    }
    return c;
}
