package br.clientregister.dao;

import br.clientregister.dbconnection.DBConnection;
import br.clientregister.domain.client.Cliente;

import java.net.UnknownServiceException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements IClienteDAO {

    @Override
    public void addCliente(Cliente cliente) {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO Cliente (nome, cpf, email) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> getAllClientes() {
        String sql = "SELECT * FROM CLIENTE";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");

                Cliente cliente = new Cliente(nome, cpf, email);

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }
}
