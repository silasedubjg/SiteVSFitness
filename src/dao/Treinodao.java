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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluno;
import model.TreinoModel;

/**
 *
 * @author vinicius
 */
public class Treinodao {

    ArrayList<String> array = new ArrayList();
    private Connection con = null;
    private Connection con2 = null;

    public Treinodao() {
        con = ConnectionFactory.getConnection();
        con2 = ConnectionFactory.getConnection();
    }

    public boolean inserir(TreinoModel Treino) {

        String sql = "INSERT into treino(Nome,Objetivo,Descricao) Values(?,?,?) ";

        PreparedStatement stmt = null;
        if (Buscar(Treino) == false) {

            try {
                stmt = (PreparedStatement) con.prepareStatement(sql);

                stmt.setString(1, Treino.getNome());
                stmt.setString(2, Treino.getObjetivo());
                stmt.setString(3, Treino.getDescricao());
                stmt.executeUpdate();

                return true;
            } catch (SQLException ex) {
                System.err.println("erro:+" + ex);
                return false;
            } finally {
                ConnectionFactory.closeConecction(con, stmt);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome ja esta sendo utilizado");
            return false;
        }
    }

    public boolean Buscar(TreinoModel Treino) {

        String sql = "SELECT * from treino where Nome = ? ";

        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con2.prepareStatement(sql);
            p.setString(1, Treino.getNome());

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

    public TreinoModel PesquisarnoBD(TreinoModel a) {
        String sql = "SELECT * from treino where Nome = ?";
        PreparedStatement p = null;
        TreinoModel aux = new TreinoModel();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, a.getNome());

            ResultSet r = p.executeQuery();

//             JOptionPane.showMessageDialog(null, "usuario encontrado");
            // Se r.next() for verdade existe uma combinação login/senha               
            while (r.next()) {
                aux.setNome(r.getString("Nome"));

                aux.setObjetivo(r.getString("Objetivo"));

                aux.setDescricao(r.getString("Descricao"));

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

    public ArrayList<String> RetornarTodos() {

        String sql = "SELECT Nome from treino order by Nome";

        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            ResultSet r = p.executeQuery();

            // Se r.next() for verdade existe uma combinação login/senha               
            while (r.next()) {
      
                String Striing =r.getString("Nome");
                array.add(Striing);

            }
           
           
            return array;

// Nunca esqueça de fechar os fluxos, eles podem acumular.
        } catch (SQLException ex) {
            System.err.println("erro:+" + ex);

        } finally {
            ConnectionFactory.closeConecction(con, p);
        }
        return array;

    }
}
