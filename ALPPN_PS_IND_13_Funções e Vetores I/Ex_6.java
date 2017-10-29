package alppn_ps_ind_13_funções.e.vetores.i;

import java.util.Scanner;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Escreva um programa que permita ao músico/usuário entrar com uma linha musical e 
 * que o usuário possa escolher se quer 
 * remover um símbolo de uma determinada posição, 
 * trocar símbolos da linha musical 
 * ou inserir um símbolo ou mais a partir de uma dada posição, 
 * mostrar a linha musical.  
 * Dica? StringBuilder, String, o que te parecer mais fácil.
 */
public class Ex_6 {
   
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        //Escreva um programa que permita ao músico/usuário entrar com uma linha musical
        System.out.println("Olá insira a linha musical sem espaços para ser manipulada.");
        String linha = entrada.nextLine();
        
        //que o usuário possa escolher se quer 
        //remover um símbolo de uma determinada posição, 
        //trocar símbolos da linha musical 
        //ou inserir um símbolo ou mais a partir de uma dada posição
        //mostrar a linha musical.
        int opcao;
        do{
            System.out.print("Linha Musical: " + linha + "\n" 
                    + "Digite a opção desejada:\n"
                    + "1 - Remover símbolo em posição determinada.\n"
                    + "2 - Trocar símbolos.\n"
                    + "3 - Inserir símbolo em posição determinada.\n"
                    + "0 - Finalizar\n"
                    + "Opção: ");
            
            opcao = entrada.nextInt();
            char simbolo;
            int posicao;
            switch (opcao){
                case 1://Remover símbolo em posição determinada
                    //solicita posição a ser removida
                    System.out.print("Digite a posição a ser removida: ");
                    posicao = entrada.nextInt();
                    //remove simbolo
                    linha = new StringBuilder(linha).deleteCharAt(posicao -1).toString();
                    break;
                case 2://Trocar simbolos
                    //solicita simbolo a ser subistituido
                    System.out.print("Digite o simbolo a ser substituido: ");
                    simbolo = entrada.next().charAt(0);
                    //solicita simbolo desejado
                    System.out.print("Digite o simbolo desejado: ");
                    char substituto = entrada.next().charAt(0);
                    //subistitui simbolo.
                    linha = linha.replace(simbolo, substituto);
                    break;
                case 3://Inserir símbolo em posição determinada
                    //solicita simbolo a ser inserido
                    System.out.print("Digite o simbolo a ser inserido: ");
                    simbolo = entrada.next().charAt(0);
                    //solicita posicao desejada
                    System.out.print("Digite a posição desejada: ");
                    posicao = entrada.nextInt();
                    //insere simbolo
                    linha = new StringBuilder(linha).insert(posicao-1, simbolo).toString();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }while(opcao != 0);
        System.out.println("Linha Musical final: " + linha);
    }
}
