package Mathematics;

public class CheckIfPrime {
    public static void main(String[] args) {
        int num=17;
        boolean flag=true;

        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("It is prime");
        }
        else{
            System.out.println("It is not prime");
        }
    }
}
