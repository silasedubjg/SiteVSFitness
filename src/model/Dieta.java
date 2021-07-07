/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinicius
 */
public class Dieta {
    private int CPF;
    private String Nome;
    private String Cafemanha;
    private String Lanchemanha;
    private String Almoco;
    private String Lanchetarde;
    private String Jantar;
    private String Ceia;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Objetivo) {
        this.Nome = Objetivo;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getCafemanha() {
        return Cafemanha;
    }

    public void setCafemanha(String Cafemanha) {
        this.Cafemanha = Cafemanha;
    }

    public String getLanchemanha() {
        return Lanchemanha;
    }

    public void setLanchemanha(String Lanchemanha) {
        this.Lanchemanha = Lanchemanha;
    }

    public String getAlmoco() {
        return Almoco;
    }

    public void setAlmoco(String Almoco) {
        this.Almoco = Almoco;
    }

    public String getLanchetarde() {
        return Lanchetarde;
    }

    public void setLanchetarde(String Lanchetarde) {
        this.Lanchetarde = Lanchetarde;
    }

    public String getJantar() {
        return Jantar;
    }

    public void setJantar(String Jantar) {
        this.Jantar = Jantar;
    }

    public String getCeia() {
        return Ceia;
    }

    public void setCeia(String Ceia) {
        this.Ceia = Ceia;
    }
    
    public Dieta(){
        
    }
    public Dieta(String Nome ){
    this.Nome=Nome;
    
}
    public Dieta(String Nome,String Cafemanha,String Lanchemanha,String Almoco,String Lanchetarde,String Jantar,String Ceia){
    this.Nome=Nome;
    this.Cafemanha=Cafemanha;
    this.Lanchemanha=Lanchemanha;
    this.Almoco= Almoco;
    this.Lanchetarde= Lanchetarde;
    this.Jantar= Jantar;
    this.Ceia= Ceia;

    
}

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

   
    
}
