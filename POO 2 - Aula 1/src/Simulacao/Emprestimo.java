/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacao;
import Items.Item;
import java.util.Calendar;
import BackEnd.Usuario;

/**
 *
 * @author alunos
 */
public class Emprestimo {
    private int codigoEmprestimo;
    private int codigoUsuario;
    private Item itensDoEmprestimo[];
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;

    public Emprestimo(int codigoEmprestimo, int codigoUsuario, Calendar dataEmprestimo, Calendar dataDevolucao) {
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    
    
    public Emprestimo(){
        itensDoEmprestimo = new Item[100];
    }

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String CalcularDataDevolucao(){
        if(codigoUsuario == 0){
         
        }
       return "cu";
    }
    
    
    
    
    
}
