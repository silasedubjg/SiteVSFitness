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
import model.Dieta;


/**
 *
 * @author vinicius
 */
public class Dietadao {

    private Connection con = null;
    private Connection con2 = null;

    public Dietadao() {
        con = ConnectionFactory.getConnection();
        con2 = ConnectionFactory.getConnection();
    }

    public boolean inserir(Dieta Dieta) {

        String sql = "INSERT into Dieta(Nome,Cafemanha,Lanchemanha,Almoco,Lanchetarde,Jantar,Ceia) Values(?,?,?,?,?,?,?) ";

        PreparedStatement stmt = null;
        if (Buscar(Dieta) == false) {

            try {
                stmt = (PreparedStatement) con.prepareStatement(sql);
                stmt.setString(1, Dieta.getNome());
                stmt.setString(2, Dieta.getCafemanha());
                stmt.setString(3, Dieta.getLanchemanha());
                stmt.setString(4, Dieta.getAlmoco());
                stmt.setString(5, Dieta.getLanchetarde());
                stmt.setString(6, Dieta.getJantar());
                stmt.setString(7, Dieta.getCeia());
            
                stmt.executeUpdate();

                return true;
            } catch (SQLException ex) {
                System.err.println("erro:+" + ex);
                return false;
            } finally {
                ConnectionFactory.closeConecction(con, stmt);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome de Deita já esta sendo utilizado");
            return false;
        }
    }
    public boolean Deletar(String Nome) {

        Dieta aux1 = new Dieta();
        aux1.setNome(Nome);
        String sql = "Delete from Dieta where Nome = ? ";
        PreparedStatement stmt = null;
        if (Buscar(aux1) == true) {

            try {
                stmt = (PreparedStatement) con.prepareStatement(sql);
                stmt.setString(1, aux1.getNome());
             
            
                stmt.executeUpdate();

                return true;
            } catch (SQLException ex) {
                System.err.println("erro:+" + ex);
                return false;
            } finally {
                ConnectionFactory.closeConecction(con, stmt);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há dieta com esse nome. ");
            return false;
        }
    }
//    public boolean inserir(Dieta Dieta){
//        
//        String sql = "INSERT into aluno(Nome,Login,Senha) Values(?,?,?) ";
//       
//        PreparedStatement stmt = null;
//        
//        
//        try {
//            stmt =(PreparedStatement) con.prepareStatement(sql);
//            stmt.setString(1, Dieta.getNome());
//           stmt.setString(2, Dieta.getLogin());
//           stmt.setString(3, Dieta.getSenha());
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

//    public boolean logar(Dieta Dieta) {
//
//        String sql = "SELECT Nome from aluno where Login = ? and Senha = ?";
//
//        PreparedStatement p = null;
//        try {
//            p = (PreparedStatement) con.prepareStatement(sql);
//            p.setString(1, Dieta.getLogin());
//            p.setString(2, Dieta.getSenha());
//            ResultSet r = p.executeQuery();
//            if (r.next()) {
////             JOptionPane.showMessageDialog(null, "usuario encontrado");
//                // Se r.next() for verdade existe uma combinação login/senha               
//                return true;
//            } else {
////                r.close();
////                p.close();
////                con.close();
//                return false;
//
//            }
//// Nunca esqueça de fechar os fluxos, eles podem acumular.
//        } catch (SQLException ex) {
//            System.err.println("erro:+" + ex);
//            return false;
//        } finally {
////            ConnectionFactory.closeConecction(con, p);
//        }
//
//    }

    public Dieta PesquisarnoBD(Dieta a) {
        String sql = "SELECT * from Dieta where Nome = ?";
        PreparedStatement p = null;
        Dieta aux = new Dieta();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, a.getNome());
          
            ResultSet r = p.executeQuery();
            
//             JOptionPane.showMessageDialog(null, "usuario encontrado");
                // Se r.next() for verdade existe uma combinação login/senha               
                while(r.next()){
                    aux.setNome(r.getString("Nome"));
           
                                     
                }
                return aux;
            
// Nunca esqueça de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);
           
        } finally {
            ConnectionFactory.closeConecction(con, p);
        }
     return aux;
    }

public boolean Buscar(Dieta Dieta) {

    String sql = "SELECT Nome from Dieta where Nome = ? ";

    PreparedStatement p = null;
    try {
        p = (PreparedStatement) con2.prepareStatement(sql);
        p.setString(1, Dieta.getNome());

        ResultSet r = p.executeQuery();
        if (r.next()) {
//             JOptionPane.showMessageDialog(null, "usuario encontrado");
            // Se r.next() for verdade existe uma combinação login/senha               
            return true;
        } else {
//            r.close();
//            p.close();
//            con.close();
            return false;

        }
// Nunca esqueça de fechar os fluxos, eles podem acumular.
    } catch (SQLException ex) {
        System.err.println("erro:+" + ex);
        return false;
    }
//        }finally{
//            ConnectionFactory.closeConecction(con2,p);
//        }

}
//public void AtualizarNome(Dieta Dieta) {
//
//  Connection con = ConnectionFactory.getConnection();
//    PreparedStatement p = null;
//    try {
//        p = (PreparedStatement) con2.prepareStatement("Update Dieta SET Nome =? Where Login=?");
//        p.setString(1, Dieta.getNome());
//      
//        
//
//       p.executeUpdate();
//// Nunca esqueça de fechar os fluxos, eles podem acumular.
//    } catch (SQLException ex) {
//        System.err.println("erro:+" + ex);
//        
//    }
////        }finally{
////            ConnectionFactory.closeConecction(con2,p);
////        }
//
//}
//public void AtualizarLogineObjetivo(Dieta Dieta) {
//
//  Connection con = ConnectionFactory.getConnection();
//    PreparedStatement p = null;
//    try {
//        p = (PreparedStatement) con2.prepareStatement("Update Dieta SET Nome=?,Objetivo =? Where Login=?");
//        p.setString(1, Dieta.getNome());
//        p.setString(2, Dieta.getObjetivo());
//        p.setString(3, Dieta.getLogin());
//        
//
//       p.executeUpdate();
//// Nunca esqueça de fechar os fluxos, eles podem acumular.
//    } catch (SQLException ex) {
//        System.err.println("erro:+" + ex);
//        
//    }
////        }finally{
////            ConnectionFactory.closeConecction(con2,p);
////        }
//
//}
//public void AtualizarInformacoes(Dieta Dieta) {
//
//  Connection con = ConnectionFactory.getConnection();
//    PreparedStatement p = null;
//    try {
//        p = (PreparedStatement) con2.prepareStatement("Update Dieta SET Altura=?,Peso =? Where Login=?");
//        p.setDouble(1, Dieta.getAltura());
//        p.setDouble(2, Dieta.getPeso());
//        p.setString(3, Dieta.getLogin());
//        
//
//       p.executeUpdate();
//// Nunca esqueça de fechar os fluxos, eles podem acumular.
//    } catch (SQLException ex) {
//        System.err.println("erro:+" + ex);
//        
//    }
////        }finally{
////            ConnectionFactory.closeConecction(con2,p);
////        }
//
//}

}
