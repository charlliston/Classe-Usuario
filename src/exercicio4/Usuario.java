
package exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charllistonadrianni
 */
public class Usuario {
    
    String nome;
    char sexo;
    int idade;
    
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
         this.sexo = sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public char trocaSexo(char sexo) {
        if (this.sexo == 'M') {
            this.sexo = 'F';
        } else if (this.sexo == 'F') {
            this.sexo = 'M';
        }
        return this.sexo;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    
    
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int trocaIdade(int idade) {
        this.idade += 1;
        
        return this.idade;
    }
    
    
    @Override
    public String toString() {
         return this.nome + ", " +this.idade + ", " +this.sexo;
    }
}
