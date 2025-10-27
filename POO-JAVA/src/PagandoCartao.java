public class PagandoCartao {
    public static void main (String[] args){

    Cartao ct1 = new Cartao();
        System.out.println();

    ct1.banco = "Nubank";
    ct1.tipo = "Visa";
    ct1.nomePortador = "Thays Marques Marciel";
    ct1.data = "12/31";
    ct1.idCartao = "xxx";
    ct1.numero = "127364";
    ct1.numAgencia = "0175-48";
    ct1.numConta = "64.762-8";
    ct1.codSeguranca = "844";
    ct1.aproxima = true;
        ct1.exibirCartao();

        System.out.println();

        ct1.aproximar();


}
}