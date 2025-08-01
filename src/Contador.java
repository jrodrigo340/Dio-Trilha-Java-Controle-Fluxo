import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
	}

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        
        if (parametroDois > parametroUm){
            for (int i = 1; i <= contagem; i++){
                System.out.printf("Imprimindo o número %s\n", i);
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}

class ParametrosInvalidosException extends Exception {
    
}