/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;
/**
 *
 * @author alunos
 */
public class AssistenteAdministrativo extends Usuario{
    protected String inicioContrato;
    protected String fimContrato;
    public AssistenteAdministrativo(int codigoUsuario, String nome, String cpf, String email,String inicioContrato,String fimContrato) {
        super(codigoUsuario, nome, cpf, email);
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }
    
    
}
