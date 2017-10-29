package alppn_ps_ind_13_funções.e.vetores.i;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Execute com Shift+F6
 * 
 * Escreva um programa que lê um número real qualquer e a quantidade de dígitos desejada pelo usuário. 
 * Passa os valores lidos para a função arredonda() e esta função retorna o valor arredondado. 
 * O programa deve mostrar o valor lido e o valor arredondado.
 */
public class Ex_4 {
    
    public static void main(String[] args) {
        //Escreva um programa que lê um número real qualquer e a quantidade de dígitos desejada pelo usuário. 
        Scanner entrada = new Scanner(System.in);
        double numero;
        int digitos;
        
        System.out.println("Insira um numero real qualquer.");
        numero = entrada.nextDouble();
        System.out.println("Insira a quantidade de dígitos desejada.");
        digitos = entrada.nextInt();
        
        //O programa deve mostrar o valor lido e o valor arredondado.
        System.out.println("O número '" + numero + "' arredondado para '" + digitos + "' digitos é: " + arredonda(numero, digitos));
    }   
    
    //assa os valores lidos para a função arredonda() e esta função retorna o valor arredondado. 
    private static double arredonda(double numero, int digitos){
        return Math.floor(numero*Math.pow(10,digitos)+0.5)/Math.pow(10,digitos);
    }
}
