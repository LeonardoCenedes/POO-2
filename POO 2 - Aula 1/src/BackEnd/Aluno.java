/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author alunos
 */
public class Aluno extends Usuario {
    protected String curso;
    protected int ano;
    public Aluno(int codigoUsuario, String nome, String cpf, String email, String curso, int ano) {
        super(codigoUsuario, nome, cpf, email);
        this.ano = ano;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
