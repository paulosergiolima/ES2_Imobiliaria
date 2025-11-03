
import Conceitos.Cliente;
import Catalogos.CatalogoClientes;
import Persistencia.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author kinipk
 */
public class SistemaDePagamento {
    private CatalogoClientes catalogoClientes;
    private Logger logger;
    
    public void pagar(String identificador) {
        Cliente cliente = catalogoClientes.buscarClientePorNome(identificador);
        cliente.pagarCobranca(0);
        logger.log("Multa paga");
        
    }
    
}
