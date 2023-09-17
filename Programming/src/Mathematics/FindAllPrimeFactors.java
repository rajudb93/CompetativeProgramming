package Mathematics;

public class FindAllPrimeFactors {
    public static void main(String[] args) {
        int num=12;

        for(int i=2;i<num/2;i++){
            if(isPrime(i)){
                int x=i;
                while(num%x==0){
                    System.out.println(i);
                    x=x*i;
                }

            }
        }
    }

    private static boolean isPrime(int i) {
        boolean flag=true;
        if(i==2){
            return  flag;
        }
        else{
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    return flag;
                }
            }
        }
        return true;
    }
}
