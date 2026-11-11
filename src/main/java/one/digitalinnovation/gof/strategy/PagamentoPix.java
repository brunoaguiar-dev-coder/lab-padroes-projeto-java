package one.digitalinnovation.gof.strategy;

public class PagamentoPix implements  EstrategiaPagamento{

    @Override
    public void pagar(double valor) {
        double valorFinal = valor * 0.90;
        System.out.printf("Pagamento via PIX realizado! Desconto aplicado. Valor final: R$ %.2f\n",
                valorFinal);
    }
}
