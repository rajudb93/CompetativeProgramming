package Mathematics;

public class CountDigit {
    public static void main(String[] args) {
        int num=9324;
        System.out.println("the number of digits="+countDigits(num));
    }

    private static int countDigits(int num) {
        int counter=0;
        while(num!=0){
            num=num/10;
            counter++;

        }
        return counter;

    }
}
