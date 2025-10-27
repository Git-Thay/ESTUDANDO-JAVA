public class UsandoCaneta {
    public static void main (String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul"; // chamada atributo
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.destampar();
        c1.status(); // chamada a metodo possui parentese
        c1.rabiscar();
        System.out.println();

        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.ponta = 1.0f;
        c2.modelo = "compactor";
        c2.tampar();
        c2.status();
        c2.rabiscar();


    }



    
}
