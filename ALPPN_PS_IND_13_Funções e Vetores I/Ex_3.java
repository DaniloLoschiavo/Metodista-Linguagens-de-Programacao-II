package alppn_ps_ind_13_funções.e.vetores.i;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Execute com Shift+F6
 * 
 * Outra maneira de verificar números primos entre 1 e 10000, esta forma é chamada de crivo de Erastóstenes. 
 * Crie um vetor de inteiros de tamanho 10001 (Explique o porquê desta minha escolha em um comentário). 
 * Depois armazene 1 em todas as posições do vetor.
 * 
 * Como por definição nem 0 e nem 1 são números primos armazene nessas posições o valor 0. 
 * Sabemos que 2 é primo, então, em todas as posições que são múltiplos de 2 armazene o valor 0
 * 
 * Terminada esta tarefa, vá para a próxima posição onde o valor armazenado é 1. 
 * De novo prossiga marcando todos os múltiplos deste número com exceção dele próprio com o valor 0, 
 * até que não haja mais valores 1 a serem pesquisados no vetor.
 */
public class Ex_3 {
    
    public static void main(String[] args) {
        int[] primos = new int[10001];// Crie um vetor de inteiros de tamanho 10001 (Explique o porquê desta minha escolha em um comentário).
        //a primeira posição de um vetor é sempre 0, 
        //então para utilizar o numero referente a posição 1000 é necesário considerar na quantidade de posições o valor 0;
        
        for(int i = 0; i < primos.length; i++)
            primos[i] = 1;//Depois armazene 1 em todas as posições do vetor.
        
        for(int i = 0; i < primos.length; i++){
            if(i == 0 || i == 1)// Como por definição nem 0 e nem 1 são números primos armazene nessas posições o valor 0. 
                primos[i] = 0;
            else if(i % 2 == 0 && i != 2)//Sabemos que 2 é primo, então, em todas as posições que são múltiplos de 2 armazene o valor 0
                primos[i] = 0;
            else //Terminada esta tarefa, vá para a próxima posição onde o valor armazenado é 1. 
                for(int p = i; p < primos.length; p+=i){
                    //De novo prossiga marcando todos os múltiplos deste número com exceção dele próprio com o valor 0, 
                    //até que não haja mais valores 1 a serem pesquisados no vetor.
                    if(p!= i && p%i == 0)
                        primos[p] = 0;
                }
        }
        //Mostrar primos
        for(int i = 0; i < primos.length; i++)
            if(primos[i] == 1)
                System.out.println(i + " é número primo.");
        
        
   }
    
}
