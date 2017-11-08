/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.util.ArrayList;
import persistencia.PFuncionario;
import projeto_hotel.Funcionario;

/**
 *
 * @author Tomás Machado
 */
public class NFuncionario {
    PFuncionario per;
    
    public NFuncionario(){
        per = new PFuncionario();
    }
    
    public void salvar(Funcionario tipo) throws Exception {
        if(tipo.getCodigo()!= -1)
            per.incluir(tipo);
        else
            per.alterar(tipo);
    }
    public void excluir (int id_funcionario) throws Exception {
        per.excluir(id_funcionario);
    }
   public Funcionario consultar(int id_funcionario) throws Exception {
       return per.consultar(id_funcionario);
   }
   public ArrayList<Funcionario> listar() throws Exception {
       return per.listar();
   }
    
}
