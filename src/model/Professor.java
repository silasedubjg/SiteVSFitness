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
public class Professor {
    
    private String Nome;
    private String Senha;
    private String Login;
   
    
    public Professor(){
        
    }
    
    public Professor(String Login,String Senha){
        this.Login=Login;
        this.Senha=Senha;
    }
     public Professor(String Login,String Senha,String Nome){
        this.Login=Login;
        this.Senha=Senha;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
}
