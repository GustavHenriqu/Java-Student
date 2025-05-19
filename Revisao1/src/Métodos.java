
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class Métodos {
    
     public static void media(){
          Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();

        System.out.println("Digite a 1ª nota:");
        float n1 = leia.nextFloat();

        System.out.println("Digite a 2ª nota:");
        float n2 = leia.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.println("Notas");

        if (media >= 7) {
            System.out.println(nome + ", você está aprovado com a média: " + media);
        } else if (media < 4) {
            System.out.println(nome + ", você está reprovado com a média: " + media);
        } else {
            System.out.println(nome + ", você está de recuperação. Sua média foi: " + media);
        }
        
        
     }//media
        public static void tabuada(){
            Scanner leia =new Scanner(System.in);
            System.out.println("Digite a tabuada");
            int tabuada = leia.nextInt();
            System.out.println("==================");
            
            for(int cont=0;cont<=10;cont++){
                System.out.println(tabuada+ "X" +cont+"="+tabuada*cont);
            }
            
        }//tabuada
      public static void habilitação(){
          
            Scanner sc = new Scanner(System.in);
            System.out.println("Passou no psicotécnico? (S para sim e N para não)");
            char pscio = sc.next(). charAt(0);
            
            System.out.println("Passou no exame Médico? (S para sim e N para não)");
            char medico = sc.next(). charAt(0);
            
            System.out.println("Passou no exame Prático? (S para sim e N para não)");
            char pratico = sc.next(). charAt(0);
            
            if ((pscio == 's') && (medico == 's') && (pratico == 's')){
                System.out.println("O aluno está habilitado: :0");
            }else{
                System.out.println("O aluno não está habilitado :(");
            }
            
    }//habilitação
}


  
