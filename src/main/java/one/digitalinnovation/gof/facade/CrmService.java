package one.digitalinnovation.gof.facade;

public class CrmService {

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente Salvo no sistema de CRM com sucesso!");
        System.out.println("Dados: " + nome + " | CEP: " + cep + " | " + cidade + "/" + estado);
    }
}
