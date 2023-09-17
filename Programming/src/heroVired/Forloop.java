package heroVired;

public class Forloop {
    public static void main(String[] args) {
/*        int counter=0;
        for(int i=3;i<=10;i++){
            //int counter=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    counter++;
                }

            }
            if(counter==2){
                System.out.println(i);
            }

        }*/


        int num=5;
        int counter=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                counter++;
            }
        }

        if(counter==2){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is prime");
        }
    }
}
