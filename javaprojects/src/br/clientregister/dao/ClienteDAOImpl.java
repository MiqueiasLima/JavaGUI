package br.clientregister.dao;

import br.clientregister.dbconnection.DBConnection;
import br.clientregister.domain.client.Cliente;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAOImpl implements IClienteDAO {

    @Override
    public void addUser(Cliente cliente) {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO Cliente (nome, cpf, email) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cliente.getNome());
            ps.setString(2,cliente.getCpf());
            ps.setString(3, cliente.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
