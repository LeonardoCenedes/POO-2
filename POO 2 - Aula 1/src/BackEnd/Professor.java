/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author alunos
 */
public class Professor extends Usuario {
    protected String titulacao;
    public Professor(int codigoUsuario, String nome, String cpf, String email,String titulacao) {
        super(codigoUsuario, nome, cpf, email);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
}
