package one.digitalinnovation.gof.strategy;

public class Pedido {

    private EstrategiaPagamento estrategia;

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void processarPagamento(double valor){
        if (this.estrategia == null){
            System.out.println("Erro: nenhuma forma de pagamento selecionada!");
            return;
        }
        this.estrategia.pagar(valor);
    }
}
