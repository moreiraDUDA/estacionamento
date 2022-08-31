/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao_ps.conexao_ps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.clienteM;
/**
 *
 * @author 0057139
 */
public class clienteDAO {
   public void inserirCliente(clienteM a) {
    try{
            String SQL = "INSERT INTO maria_eduarda.cliente (nomeC, rgC, telefoneC, enderecoC, placaC, carroC) VALUES (?,?,?,?,?,?)";
            Connection CONEXAO = conexao_ps.getConexao();
            PreparedStatement comandoSQL = CONEXAO.prepareStatement(SQL);
            comandoSQL.setString(1, a.getNomeC());
            comandoSQL.setString(2, a.getRgC());
            comandoSQL.setString(3, a.getTelefoneC());
            comandoSQL.setString(4, a.getEnderecoC());
            comandoSQL.setString(5, a.getPlacaC());
            comandoSQL.setString(6, a.getCarroC());
            
            int retorno = comandoSQL.executeUpdate();
            CONEXAO.close();
            
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Cliente "+a.getNomeC()+" inserido com sucesso.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir cliente "+a.getNomeC()+ "\n VERIFIQUE OS LOGS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
