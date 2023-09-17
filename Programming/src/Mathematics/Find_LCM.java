package Mathematics;

public class Find_LCM {
    public static void main(String[] args) {
        int a=15,b=20;
        int maximum=Math.max(a,b);
       // boolean c=true;

        while(true){
            if(maximum%a==0 && maximum%b==0){
              //  c=false;
                break;
            }
            else{
                maximum++;
            }
        }

        System.out.print("LCM="+maximum);

    }
}
