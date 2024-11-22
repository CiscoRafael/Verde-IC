import java.util.*;
public class Questao4
{
    public static void main(String[] args) {
        int N, P, M, alunosP = 0, alunosM = 0;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.nextLine(); 
        System.out.printf("#");
        int[] Ti = new int[N];
        for(int i = 0; i < N; i++){
            Ti[i] = input.nextInt();
            if(Ti[i] == 1){
                alunosP++;
            } else if(Ti[i] == 2){
                alunosM++;
            }
        }
        input.nextLine();
        System.out.printf("#");
        P = input.nextInt();
        input.nextLine();
        System.out.printf("#");
        M = input.nextInt();
        input.nextLine(); 
        if(P == alunosP && M == alunosM){
            System.out.println("S");
        } else{
            System.out.println("N");
        }
    }
}
