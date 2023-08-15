/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacao;

import BackEnd.Usuario;
import Items.Item;

/**
 *
 * @author alunos
 */
public class Biblioteca {
    private String nome;
    private Emprestimo emprestimos[];
    private Item itens[];
    private Usuario usuarios[];

    public Biblioteca(String nome, Emprestimo[] emprestimos) {
        this.nome = nome;
        this.emprestimos = emprestimos;
    }
    
    public Biblioteca(){
        itens = new Item[100];
        usuarios = new Usuario[50];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    
    
}
