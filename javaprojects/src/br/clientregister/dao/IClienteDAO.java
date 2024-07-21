package br.clientregister.dao;

import br.clientregister.domain.client.Cliente;

import java.util.List;

public interface IClienteDAO {

    void addCliente(Cliente cliente);
    List<Cliente> getAllClientes();
}
