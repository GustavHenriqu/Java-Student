/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Digite a tabuada desejada:");
        int tabuada=entrada.nextInt();
        System.out.println("======");
        
        for(int contador=1; contador<=10; contador++){
            System.out.println(tabuada+"x"+contador+"="+tabuada*contador);
        }
        System.out.println("======");
    }
}
