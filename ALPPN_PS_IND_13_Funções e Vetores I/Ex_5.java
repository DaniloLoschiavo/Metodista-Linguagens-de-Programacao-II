package alppn_ps_ind_13_funções.e.vetores.i;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Execute com Shift+F6
 * 
 * Escreva um programa que leia uma linha de texto e um caractere qualquer. 
 * No final seu programa deverá mostrar quantas vezes o caractere aparece na linha de texto. 
 * Use as funções da classe String.
 * 
 * Exemplo: As entradas: “Estamos aprendendo sobre a classe String” e ‘s’, produziria a resposta 6.
 */
public class Ex_5 {
   
    public static void main(String[] args) {
       //Escreva um programa que leia uma linha de texto e um caractere qualquer. 
       Scanner entrada = new Scanner(System.in);
       int contadorCaracteres = 0;
       
       System.out.println("Insira o um texto.");
       String texto = entrada.nextLine();
       
       entrada = new Scanner(System.in);
       System.out.println("Insira o caractere a ser contado.");
       char caractere = entrada.next().toLowerCase().charAt(0);
       
       //No final seu programa deverá mostrar quantas vezes o caractere aparece na linha de texto. 
       //Use as funções da classe String.
       //String.toLowerCase() : retorna todos os caracteres para letras minusculas
       //String.toCharArray() : retorna vetor de caracteres da string
       for(char c : texto.toLowerCase().toCharArray()){
           if(caractere == c)
               contadorCaracteres++;
       }
       System.out.println("O texto posui " + contadorCaracteres + " caracteres '" + caractere + "'.");
   } 
}
