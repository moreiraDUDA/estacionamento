package dao;

import conexao_ps.conexao_ps;
import modelo.carroM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class carroDAO {
    public void inserirCarro(carroM a) {
        try{
            String SQL = "INSERT INTO maria_eduarda.carro (nome_cliente, nome_funcionario, tempo, placa) VALUES (?,?,?,?)";
            Connection CONEXAO = conexao_ps.getConexao();
            PreparedStatement comandoSQL = CONEXAO.prepareStatement(SQL);
            comandoSQL.setString(1, a.getNome_cliente());
            comandoSQL.setString(2, a.getNome_funcionario());
            comandoSQL.setString(3, a.getTempo());
            comandoSQL.setString(4, a.getPlaca());
            
            int retorno = comandoSQL.executeUpdate();
            CONEXAO.close();
            
            if(retorno>0){
                JOptionPane.showMessageDialog(null,"Carro "+a.getPlaca()+" inserido com sucesso.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao inserir carro "+a.getPlaca()+ "\n VERIFIQUE OS LOGS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(carroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
