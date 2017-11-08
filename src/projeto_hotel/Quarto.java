/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_hotel;

/**
 *
 * @author aluno
 */
public class Quarto {
    private int numeroDoquarto;
    private int qtDeHospedes;
    private String locado;
    private String disponivel;
    
    
    

    public int getNumeroDoquarto() {
        return numeroDoquarto;
    }

    public void setNumeroDoquarto(int numeroDoquarto) {
        this.numeroDoquarto = numeroDoquarto;
    }

    public int getQtDeHospedes() {
        return qtDeHospedes;
    }

    public void setQtDeHospedes(int qtDeHospedes) {
        this.qtDeHospedes = qtDeHospedes;
    }

    public String getLocado() {
        return locado;
    }

    public void setLocado(String locado) {
        this.locado = locado;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
    
}
