/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Media {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        System.out.println("O nome digitado foi: " + nome);
           
        Float valor1 = Float.valueOf(JOptionPane.showInputDialog(" Digite a 1º Nota").replaceAll(",","."));
        System.out.println("A nota inserida foi: " + valor1);
        Float valor2 = Float.valueOf(JOptionPane.showInputDialog(" Digite a 2º Nota").replaceAll(",","."));
        System.out.println("A nota inserida foi: " + valor2);
        float media =(valor1 + valor2)/2;
        
            if (media>=7){
                JOptionPane.showMessageDialog(null, nome + " a sua média é "+media+"====Aprovado====");
            }
            else if (media<4){
                JOptionPane.showMessageDialog(null, nome + " a sua média é "+media+"===Reprovado===");
            }else
                JOptionPane.showMessageDialog(null, nome + " a sua média é "+media+"===Recuperação===");
    
    }//Principal
    
}//Classe
