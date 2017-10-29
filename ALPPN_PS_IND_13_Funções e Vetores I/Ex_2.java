package alppn_ps_ind_13_funções.e.vetores.i;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Execute com Shift+F6
 * 
 * Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. 
 * Por exemplo, 2, 3, 5, e 7 são primos, mas, 4, 6, 8 e 9 Não. O número 1 por definição não é primo.
 * 
 * a. Escreva um método que determina se um número é primo retornando true no caso de sim, ou, false em caso contrário.
 * 
 * b. Utilize este método em um aplicativo que determina e exibe todos os primos menores que 10000.
 * 
 * c. Inicialmente você deve ter testado todos os números entre 2 e 10000. Correto? 
 * Teste agora apenas de 2 até a raiz quadrada de 10000. Reescreva o programa mostrando as duas formas.
 * 
 */
public class Ex_2 {
   
        public static void main(String[] args) {
            
            //b. Utilize este método em um aplicativo que determina e exibe todos os primos menores que 10000.
            for(int n = 2; n <= 10000; n++){
                if(numeroPrimo(n))
                    System.out.println(n +" é número primo.");
            }            
            
            System.out.println("------------------------------------------------------------");
            //c. Inicialmente você deve ter testado todos os números entre 2 e 10000. Correto? 
            //Teste agora apenas de 2 até a raiz quadrada de 10000. Reescreva o programa mostrando as duas formas.
            for(int n = 2; n <= Math.sqrt(10000); n++){
                if(numeroPrimo(n))
                    System.out.println(n +" é número primo.");
            }    
        }
    
        //a. Escreva um método que determina se um número é primo retornando true no caso de sim, ou, false em caso contrário.
        private static boolean numeroPrimo(int numero){
            int contador = 0;
            for (int i=1; i <= numero; i++){
                if(numero%i == 0){
                   contador++;
                }
            }
            return contador == 2;
        }
}
