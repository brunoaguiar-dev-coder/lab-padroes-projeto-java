package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args){

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        EstrategiaPagamento viaPix = new PagamentoPix();
        EstrategiaPagamento viaCartaoCredito = new PagamentoCartaoCredito();
        EstrategiaPagamento viaBoleto = new PagamentoBoleto();

        Pedido pedido = new Pedido();
        pedido.setEstrategia(viaPix);
        pedido.processarPagamento(100.0);
        pedido.setEstrategia(viaCartaoCredito);
        pedido.processarPagamento(100.0);
        pedido.setEstrategia(viaBoleto);
        pedido.processarPagamento(100);

        // facade
        Facade facade = new Facade();
        facade.migrarCliente("Usuario", "128567");




    }
}
