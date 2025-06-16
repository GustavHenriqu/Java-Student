


import java.util.Scanner;

public class TabuadaForWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String resposta = "s";
        while(resposta.equalsIgnoreCase("s")){
        
        
        System.out.println("Digite a tabuada: ");
        int tabuada = scanner.nextInt();
        System.out.println("**********");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(tabuada+" X "+i+" = "+tabuada*i);
            
        }
        
        System.out.println("Você deseja continuar? (s) para sim e (n) para não");
        String s = scanner.next();
        resposta = s;
        }
        System.out.println("*******Sistema finalizado******");
    }
    
}
