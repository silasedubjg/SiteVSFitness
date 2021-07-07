/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author vinicius
 */
public class TreinoModel {
    private String Nome;
    private String Descricao; 
    private  String Exercicio;
    private String codigo;
    private String Objetivo;
    public TreinoModel(){
        
    }
    public TreinoModel(String Nome){
        this.Nome=Nome;
        
    }
    public TreinoModel(String Nome,String Objetivo,String Descricao){
        this.Nome=Nome;
        this.Objetivo=Objetivo;
        this.Descricao=Descricao;
        
    }
    public String getExercicio() {
        return Exercicio;
    }

    public void setExercicio(String Exercicio) {
        this.Exercicio = Exercicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(String Objetivo) {
        this.Objetivo = Objetivo;
    }
        
  
    private ArrayList<String> Array = new ArrayList();
 
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public ArrayList<String> getArray() {
        return Array;
    }

    public void setArray(ArrayList<String> Array) {
        this.Array = Array;
    }
}
