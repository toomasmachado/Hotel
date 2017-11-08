/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projeto_hotel.Funcionario;

/**
 *
 * @author Tomás Machado
 */
public class PFuncionario {
    
    public void incluir(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario( nome, cpf, sexo, data_nascimento, telefone, email, cargo) VALUES(?, ?, ?, ?, ?, ?, ?);";

        Connection cmn = util.Conexao.getConexao();

        PreparedStatement prd = cmn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        //Seta os valores para o procedimento
        prd.setString(1, funcionario.getNome());
        prd.setString(2, funcionario.getCPF());
        prd.setString(3, funcionario.getSexo());
        prd.setString(4, funcionario.getdNacimento());
        prd.setString(5, funcionario.getTelefone());
        prd.setString(6, funcionario.getEmail());
        prd.setString(7, funcionario.getCargo());

        //Executa o comando no banco de dados
        prd.execute();
        
        ResultSet rs = prd.getGeneratedKeys();
        if(rs.next()){
            funcionario.setCodigo(rs.getInt("id_funcionario"));
        }

        //Cria o SQL para recuperar o código gerado
        /* String sql2 = "SELECT currval('funcionarios_cpf_seq') as cpf";
        
        Statement stm = cmn.createStatement();
        
        ResultSet rs = stm.executeQuery(sql2);
        if(rs.next()){
            int cpf = rs.getInt("CPF");
            funcionario.setCpf(cpf);
        }
        rs.close();*/
        cmn.close();
    }

    public void alterar(Funcionario funcionario) throws Exception {
        String sql = "UPDATE funcionario SET "
                + " nome = ? "
                + " cpf = ? "
                + " sexo = ? "
                + " data_nascimento = ? "
                + " telefone = ? "
                + " email = ? "
                + " cargo = ? "
                + " WHERE id_funcionario = ?";

        Connection cmn = util.Conexao.getConexao();

        PreparedStatement prd = cmn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setInt(1, funcionario.getCodigo());
        prd.setString(2, funcionario.getNome());
        prd.setString(3, funcionario.getCPF());
        prd.setString(4, funcionario.getSexo());
        prd.setString(5, funcionario.getdNacimento());
        prd.setString(6, funcionario.getTelefone());
        prd.setString(7, funcionario.getEmail());
        prd.setString(8, funcionario.getCargo());

        //Executa o comando no banco de dados
        prd.execute();

        prd.close();
        cmn.close();
    }

    public void excluir(int id_funcionario) throws Exception {
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?;";

        Connection cmn = util.Conexao.getConexao();

        PreparedStatement prd = cmn.prepareStatement(sql);
        prd.setInt(1, id_funcionario);

        prd.execute();

        prd.close();
        cmn.close();
    }

    public Funcionario consultar(int id_funcionario) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE id_funcionario = ?";

        Connection cmn = util.Conexao.getConexao();

        PreparedStatement prd = cmn.prepareStatement(sql);
        prd.setInt(1, id_funcionario);

        ResultSet rs = prd.executeQuery();

        Funcionario objeto = null;

        if (rs.next()) {
            objeto = new Funcionario();
            objeto.setCodigo(rs.getInt("Identificador"));
            objeto.setNome(rs.getString("Nome"));
            objeto.setCPF(rs.getString("CPF"));
            objeto.setSexo(rs.getString("Sexo"));
            objeto.setdNacimento(rs.getString("Data De Nascimento"));
            objeto.setTelefone(rs.getString("Telefone"));
            objeto.setEmail(rs.getString("E-mail"));
            objeto.setCargo(rs.getString("Cargo"));
        }

        prd.close();
        rs.close();
        cmn.close();

        return objeto;
    }

    public ArrayList<Funcionario> listar() throws Exception {
        String sql = "SELECT * FROM funcionario ORDER BY id_funcionario";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        while (rs.next()) {
            Funcionario objeto = new Funcionario();
            objeto.setCodigo(rs.getInt("Identificador"));
            objeto.setNome(rs.getString("Nome"));
            objeto.setCPF(rs.getString("CPF"));
            objeto.setSexo(rs.getString("Sexo"));
            objeto.setdNacimento(rs.getString("Data De Nascimento"));
            objeto.setTelefone(rs.getString("Telefone"));
            objeto.setEmail(rs.getString("E-mail"));
            objeto.setCargo(rs.getString("Cargo"));

            lista.add(objeto);
        }
        rs.close();
        cnn.close();

        return lista;

    }
    
}
