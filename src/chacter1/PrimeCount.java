package chacter1;

public class PrimeCount {
    public static long primeSum = 0;
    public static void main(String args[]){
        for(long i=2L;i<10000000;i++){
            for(long j=2L;j<=(int)(Math.sqrt(i));j++){
                if(i%j==0){
                    primeSum++;
                    break;
                }
            }
        }
        System.out.println("素数总和为："+primeSum);
    }
}
