package one.digitalinnovation.gof.strategy;

public class PagamentoBoleto implements EstrategiaPagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto bancário gerado com sucesso no valor de R$ %.2f \n", valor);
    }
}
