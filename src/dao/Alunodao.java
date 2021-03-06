/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import model.Aluno;

/**
 *
 * @author vinicius
 */
public class Alunodao {

    private Connection con = null;
    private Connection con2 = null;

    public Alunodao() {
        con = ConnectionFactory.getConnection();
        con2 = ConnectionFactory.getConnection();
    }

    public boolean inserir(Aluno Aluno) {

        String sql = "INSERT into aluno(Nome,Login,Senha,Status) Values(?,?,?,?) ";

        PreparedStatement stmt = null;
        if (Buscar(Aluno) == false) {

            try {
              //  JOptionPane.showMessageDialog(null, Aluno.getStatus());
                stmt = (PreparedStatement) con.prepareStatement(sql);
                stmt.setString(1, Aluno.getNome());
                stmt.setString(2, Aluno.getLogin());
                stmt.setString(3, Aluno.getSenha());
                stmt.setString(4, Aluno.getStatus());
                stmt.executeUpdate();

                return true;
            } catch (SQLException ex) {
                System.err.println("erro:+" + ex);
                return false;
            } finally {
                ConnectionFactory.closeConecction(con, stmt);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ja esta sendo utilizado");
            return false;
        }
    }
//    public boolean inserir(Aluno Aluno){
//        
//        String sql = "INSERT into aluno(Nome,Login,Senha) Values(?,?,?) ";
//       
//        PreparedStatement stmt = null;
//        
//        
//        try {
//            stmt =(PreparedStatement) con.prepareStatement(sql);
//            stmt.setString(1, Aluno.getNome());
//           stmt.setString(2, Aluno.getLogin());
//           stmt.setString(3, Aluno.getSenha());
//            stmt.executeUpdate();
//      
//            return true;
//        } catch (SQLException ex) {
//            System.err.println("erro:+"+ex);
//            return false;
//        }finally{
//            ConnectionFactory.closeConecction(con,stmt);
//        }
//       
//    }
//    

    public boolean logar(Aluno Aluno) {

        String sql = "SELECT Nome from aluno where Login = ? and Senha = ?";

        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, Aluno.getLogin());
            p.setString(2, Aluno.getSenha());
            ResultSet r = p.executeQuery();
            
            if (r.next()) {
//             JOptionPane.showMessageDialog(null, "usuario encontrado");
                // Se r.next() for verdade existe uma combina????o login/senha               
                return true;
            } else {
//                r.close();
//                p.close();
//                con.close();
                return false;

            }
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);
            return false;
        } finally {
//            ConnectionFactory.closeConecction(con, p);
        }

    }

    public Aluno PesquisarnoBD(Aluno a) {
        String sql = "SELECT * from aluno where Login = ? and Senha = ?";
        
        PreparedStatement p = null;
        Aluno aux = new Aluno();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, a.getLogin());
            p.setString(2, a.getSenha());
           
            ResultSet r = p.executeQuery();

//             JOptionPane.showMessageDialog(null, "usuario encontrado");
            // Se r.next() for verdade existe uma combina????o login/senha               
            while (r.next()) {
                aux.setNome(r.getString("Nome"));

                aux.setLogin(r.getString("Login"));

                aux.setSenha(r.getString("Senha"));

                aux.setAltura(r.getDouble("Altura"));

                aux.setPeso(r.getDouble("Peso"));
                
                aux.setStatus(r.getString("Status"));

            }
            return aux;

// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        } finally {
            ConnectionFactory.closeConecction(con, p);
        }
        return aux;
    }

    public boolean Buscar(Aluno Aluno) {

        String sql = "SELECT Nome from aluno where Login = ? ";

        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement(sql);
            p.setString(1, Aluno.getLogin());

            ResultSet r = p.executeQuery();
            if (r.next()) {
//             JOptionPane.showMessageDialog(null, "usuario encontrado");
                // Se r.next() for verdade existe uma combina????o login/senha               
                return true;
            } else {
//            r.close();
//            p.close();
//            con.close();
                return false;

            }
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);
            return false;
        }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

    }

    public void AtualizarSenha(Aluno Aluno) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement("Update Aluno SET Senha =? Where Login=?");
            p.setString(1, Aluno.getSenha());
            p.setString(2, Aluno.getLogin());

            p.executeUpdate();
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

    }

    public void AtualizarTreino(Aluno Aluno) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement("Update Aluno SET NomeTreino =? Where Login=?");
//        Where Login=?"
            p.setString(1, Aluno.getNomeTreino());
            p.setString(2, Aluno.getLogin());

            p.executeUpdate();
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

    }

    public void AtualizarLogineObjetivo(Aluno Aluno) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement("Update Aluno SET Nome=?,Objetivo =? Where Login=?");
            p.setString(1, Aluno.getNome());
            p.setString(2, Aluno.getObjetivo());
            p.setString(3, Aluno.getLogin());

            p.executeUpdate();
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

    }

    public void AtualizarInformacoes(Aluno Aluno) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement("Update Aluno SET Altura=?,Peso =? Where Login=?");
            p.setDouble(1, Aluno.getAltura());
            p.setDouble(2, Aluno.getPeso());
            p.setString(3, Aluno.getLogin());

            p.executeUpdate();
// Nunca esque??a de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

    }

}
