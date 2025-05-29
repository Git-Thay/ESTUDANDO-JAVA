import java.util.Scanner;

public class QuartoPrograma{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int primeiroNumero = scanner.nextInt();
        
        System.out.print("Digite outro número: ");
        int segundoNumero = scanner.nextInt();
        
        System.out.print("Informe o operador: ");
        char oPerador = scanner.next().charAt(0);
        
        int resultado = 0;
        
        switch (oPerador){
            case '+':
                resultado = primeiroNumero + segundoNumero;
                break;
            
            case '-':
                resultado = primeiroNumero - segundoNumero;
                break;
                
            case '*':
                resultado = primeiroNumero * segundoNumero;
                break;
            
            case '/':
            if (segundoNumero !=0){
                resultado = primeiroNumero / segundoNumero;
            } else {
                System.out.print("Erro, divisão por zero.");
                scanner.close();
                return;
            }
            break;
            
            default:
            System.out.print("Operador inválido!");
            scanner.close();
            return;
            
        }
        
       System.out.println("O resultado é: " + resultado);
        
        scanner.close();
        
        
    }
}