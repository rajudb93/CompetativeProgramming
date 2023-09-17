package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of peg
    }

    private static void solveTowerOfHanoi(int n, char from_peg, char to_peg, char aux_peg) {
        if(n==1){
            System.out.println("Move disk from "+from_peg+" to peg "+to_peg);
            return;
        }

        solveTowerOfHanoi(n-1, from_peg,aux_peg,to_peg);
        System.out.println("Move disk from "+from_peg+" to peg "+to_peg);
        solveTowerOfHanoi(n-1, aux_peg,to_peg,from_peg);
    }
}
