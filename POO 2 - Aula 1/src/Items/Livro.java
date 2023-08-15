/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author alunos
 */
public class Livro extends Item{
    protected String nome;
    protected String editora;

    public Livro(String nome, String editora, int codigoItem, boolean estaEmprestado) {
        super(codigoItem, estaEmprestado);
        this.nome = nome;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
    
    
}
