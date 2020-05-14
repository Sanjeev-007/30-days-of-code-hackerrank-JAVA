public void computeDifference(){
    int dif=0;
    for(int i=0;i<elements.length;i++){
        for(int j=i+1;j<elements.length;j++){
            if((Math.abs(elements[i]-elements[j]))  > dif){
                dif=(Math.abs(elements[i]-elements[j]));
            }
        }
    }
    maximumDifference=dif;
}
