/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Mediafor {
    public static void main(String[] args) {
        float nota = 0, media = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        
        for (int cont = 1; cont <= 4; cont++){
            System.out.println("Digite a " + cont + "ºnota");
            nota += entrada.nextByte();
        }
        media = nota/4;
        if(media>=7){
            System.out.println(nome+" a sua média é " +media+ "=Aprovado=");
        }
        else{
            System.out.println(nome + " a sua média é " +media+ "=Reprovado=");
        }       
    }
    
}
