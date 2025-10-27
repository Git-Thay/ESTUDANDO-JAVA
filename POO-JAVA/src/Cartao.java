public class Cartao {
    String banco;
    String tipo;
    String nomePortador;
    String data;
    String idCartao;
    String numero;
    String numAgencia;
    String numConta;
    String codSeguranca;
    boolean aproxima;

    void exibirCartao(){
        System.out.println("Instituição: " + this.banco);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nome: " + this.nomePortador);
        System.out.println("Data: " + this.data);
        System.out.println("Id Cartao: " + this.idCartao);
        System.out.println("Numero: " + this.numero);
        System.out.println("Numero Agencia: " + this.numAgencia);
        System.out.println("Numero Conta: " + this.numConta);
        System.out.println("Codigo de Seguranca: " + this.codSeguranca);
    }

    void aproximar(){
        if (aproxima == false){
            System.out.println("ERRO! O cartao não realiza aproximação! \nTente inserir.");
        } else {
            System.out.println("Pagamento efetuado!");
        }
    }

    void inserir(){
        System.out.println("O cartao foi inserido com sucesso");
        //System.out.println("Digite sua senha: ");
       // System.out.println("Pagamento efetuado!");
    }





}
