package one.digitalinnovation.gof.strategy;

public class PagamentoCartaoCredito implements EstrategiaPagamento{
    @Override
    public void pagar(double valor) {
        double valorFinal = valor * 1.05;
        System.out.printf("Pagamento via cartão de credito realizado! Taxa de 5%% aplicada. Valor final: R$ %.2f\n",
                valorFinal);

    }
}
