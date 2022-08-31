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
import modelo.funcionarioM;

/**
 *
 * @author 0057139
 */
public class funcionarioDAO {
    public void inserirFuncionario(funcionarioM a) {
        try{
            String SQL = "INSERT INTO maria_eduarda.funcionario (nomeF, rgF, telefoneF, enderecoF, placaF, carroF) VALUES (?,?,?,?,?,?)";
            Connection CONEXAO = conexao_ps.getConexao();
            PreparedStatement comandoSQL = CONEXAO.prepareStatement(SQL);
            comandoSQL.setString(1, a.getNomeF());
            comandoSQL.setString(2, a.getRgF());
            comandoSQL.setString(3, a.getTelefoneF());
            comandoSQL.setString(4, a.getEnderecoF());
            comandoSQL.setString(5, a.getPlacaF());
            comandoSQL.setString(6, a.getCarroF());
            
            int retorno = comandoSQL.executeUpdate();
            CONEXAO.close();
            
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Funcionario "+a.getNomeF()+" inserido com sucesso.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir funcionário "+a.getNomeF()+ "\n VERIFIQUE OS LOGS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(carroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
