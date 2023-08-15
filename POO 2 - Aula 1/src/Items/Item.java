/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Items;

/**
 *
 * @author alunos
 */
public abstract class Item {
    protected int codigoItem;
    protected boolean estaEmprestado;

    public Item(int codigoItem, boolean estaEmprestado) {
        this.codigoItem = codigoItem;
        this.estaEmprestado = estaEmprestado;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }
    
    
}
