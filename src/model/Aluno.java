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
public class Aluno {
    private String Status;
    private String Nome;
    private double Peso;
    private double Altura;
    private String Senha;
    private String Login;
    private String Objetivo;
    private String NomeTreino;

    public String getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(String Objetivo) {
        this.Objetivo = Objetivo;
    }
    
    public Aluno(){
        
    }
    public Aluno(String Nome ){
    this.Nome=Nome;
    
}
    public Aluno(String Nome,String Login,String Senha ){
    this.Nome=Nome;
    this.Login=Login;
    this.Senha= Senha;
    
}
    public Aluno(String Nome,String Login,String Senha,String Status ){
    this.Nome=Nome;
    this.Login=Login;
    this.Senha= Senha;
    this.Status=Status;
}
    public Aluno(String Login,String Senha ){
 
    this.Login=Login;
    this.Senha= Senha;
    
}

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    public void setNomeTreino(String NomeTreino) {
        this.NomeTreino = NomeTreino;
    }
    public String getNomeTreino() {
        return NomeTreino;
    }
    public Aluno(String Status,String Nome,double Peso,double Altura){
    this.Nome=Nome;
    this.Status=Status;
     this.Peso=Peso;
      this.Altura=Altura;
}
    public Aluno(String Status,String Nome,double Peso ){
    this.Nome=Nome;
    this.Status=Status;
    this.Peso=Peso;
}
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    
}
