package alppn_ps_ind_13_funções.e.vetores.i;

import java.util.Scanner;
/**
 *
 * @author Danilo Loschiavo
 * 
 * Execute com Shift+F6
 * 
 * Escreva uma função que aceita um valor inteiro, cria um novo número que é o original invertido e 
 * retorna o resultado. Por exemplo original = 1234 que gera o invertido = 4321. 
 * Incorpore a função a um aplicativo que lê um valor, passa este valor para a função e imprime 
 * tanto o valor lido quanto o valor invertido.
 */
public class Ex_1 {
    
    public static void main(String[] args) {
        //Incorpore a função a um aplicativo que lê um valor, passa este valor para a função e imprime 
        //tanto o valor lido quanto o valor invertido.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Olá, por favor insira uma sequência de numeros.");
        int numeros = entrada.nextInt();
        
        System.out.println("O inverso de '" + numeros + "' é '" + inverterNumeros(numeros) +"'.");
    }
    
    //Escreva uma função que aceita um valor inteiro, cria um novo número que é o original invertido e 
    //retorna o resultado. Por exemplo original = 1234 que gera o invertido = 4321. 
    private static int inverterNumeros(int numeros){        
        int invertido = Integer.valueOf(new StringBuilder(String.valueOf(numeros)).reverse().toString());
        return invertido;
    }
    
}
