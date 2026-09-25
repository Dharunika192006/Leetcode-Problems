bool isHappy(int n) {
    int rem=0,sum=0;
    if(n==1){
        return true;
    }
    else if(n<10){
        return false;
    }
    else{
        while(n>0){
            rem=n%10;
            sum+=(rem*rem);
            n/=10;
        }
        return isHappy(sum);
    }
    
}
