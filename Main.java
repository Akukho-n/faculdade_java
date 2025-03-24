import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    Random randomizacao = new Random();
    int choose = 0;
    int tentativas = 0;
    int cpu = randomizacao.nextInt(100) + 1;
    while (tentativas <= 10) {
        String tente_adivinhar_ascii = 
        "  O  \n" +
        " /|\\ \n" +
        " / \\ \n" +
        " \n" +
        "Tente adivinhar o número escolhido!\n" +
        " \n" +
        "Digite o número abaixo e tente acertar!";
        
        System.out.println(tente_adivinhar_ascii);
        choose = leitura.nextInt();
    if (choose == cpu){
        System.out.println("Parabens voceh acertou!");
        System.out.println("Você só precisou de "+ tentativas + "Tentativas");
        break;
    }else {
        String voco_errou_asciiArt = 
        " TTTTT  RRRR    Y   Y   AAAAA   GGGG   AAAAA  III  N   N \n" +
        "   T    R   R    Y Y   A     A  G       A     A   I   NN  N \n" +
        "   T    RRRR     Y    AAAAAAA  G  GG   AAAAA  I   N N N \n" +
        "   T    R  R     Y    A     A  G   G   A     A   I   N  NN \n" +
        "   T    R   R    Y    A     A  GGGG    AAAAA  III  N   N \n";
        System.out.println(voco_errou_asciiArt);
        tentativas++;
    if (choose < cpu){
        System.out.println("O numero eh maior");
    }else{
        System.out.println("O numero eh menor");
        }
    }
    if (tentativas == 10){
        System.out.println("Acabaram as tentativas, o numero escolhido foi " + cpu);
        System.out.println("Quer tentar novamente ?");
        choose = leitura.nextInt();
        if(choose == 1){
        tentativas = 0;
            }
        else{
            String Obrigado_asciiArt = 
            " OOO   BBBBB   RRRR    III  GGGG   RRRR    AAAAA  DDDD   OOO \n" +
            "O   O  B    B  R   R    I   G       R   R   A     A  D   D  O   O\n" +
            "O   O  BBBBB   RRRR     I   G  GG   RRRR    AAAAAAA  D   D  O   O\n" +
            "O   O  B    B  R  R     I   G   G   R  R    A     A  D   D  O   O\n" +
            " OOO   BBBBB   R   R   III  GGGG   R   R   A     A  DDDD   OOO \n";

            System.out.println(Obrigado_asciiArt);
                }
        
    }
        }   
    }
}