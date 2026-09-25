int maxProfit(int* prices, int pricesSize) {
    int min=prices[0];
    int maxprof=0;
    for(int i=1;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        else if(prices[i]-min>maxprof){
            maxprof=prices[i]-min;
        }
    }
    return maxprof;
}
