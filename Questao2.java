import java.util.*;
public class Questao2
{
    public static void main(String[] args) {
        int n, t;
        int maiorTempoM = 0, homemMaiorTempo = 0;
        int maiorTempoF = 0, mulherMaiorTempo = 0;
        Scanner input = new Scanner(System.in);
        char i;
        
        do {
            n = input.nextInt();
            t = input.nextInt();
            input.nextLine();
            i = input.next().charAt(0);
            
            if (i == 'M' && n >= 1001 && n <= 9999 && t >= 3600 && t <= 7200) {
                if (t > maiorTempoM) {
                    maiorTempoM = t;
                    homemMaiorTempo = n;
                }
            } else if (i == 'F' && n >= 1001 && n <= 9999 && t >= 3600 && t <= 7200) {
                if (t > maiorTempoF) {
                    maiorTempoF = t;
                    mulherMaiorTempo = n;
                }
            }
        } while (n != 0);
        
        System.out.println(mulherMaiorTempo + " " + maiorTempoF + " F");
        System.out.println(homemMaiorTempo + " " + maiorTempoM + " M");
    }
}
