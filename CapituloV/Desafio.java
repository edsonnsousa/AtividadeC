package CapituloV;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafio {

    public static void main(String[] args) {
        //Declarando o array de 100 elementos
        int[] vetor = new int[100];
        
        //preenchendo os dois elementos inicias
        vetor[0]=0;
        vetor[1]=1;
        int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a posicao: " )); 
         
        
        //vamos calcular do elemento 2 até o elemento n
        for(int i=2 ; i<=n ; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        
        JOptionPane.showMessageDialog(null,"Elemento " + n + " Valor: " + vetor[n]);
    }

}