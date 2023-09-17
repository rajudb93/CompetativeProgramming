package Mathematics;

public class FindAllDivisiorsOfNumbers {
    public static void main(String[] args) {
        int num=100;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
