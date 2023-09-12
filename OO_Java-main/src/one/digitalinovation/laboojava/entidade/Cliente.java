package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe que representa a entidade cliente. Este pode fazer um pedido.
 * @author thiago leite
 */
public class Cliente {

    /**
     * Nome completo do cliente.
     */
    private String nome;

    /**
     * Número de CPF(Cadastro de Pessoa Física) do cliente.
     */
    //private String cpf;
    
    static List<String> cpfs = new ArrayList<String>();
    
   //private String[] cpfs = {"10787886931", "10787886932", "10787886933", "10787886934"};
   

 
    public void addCpf(String cpf) {
    	cpfs.add(cpf);
    	
    }


    public String getNome() {
        return nome;
    }

    public List<String> getCpfs() {
		return cpfs;
	}

	public void setCpfs(List<String> cpfs) {
		this.cpfs = cpfs;
	}

	public void setNome(String nome) {
        this.nome = nome;
    }

    //public String getCpf() {
   //     return cpf;
   // }

   // public void setCpf(String cpf) {
   //     this.cpf = cpf;
  //  }

    @Override
    public String toString() {
        return "Cliente{ nome='" + nome + "'}";
    }
}
