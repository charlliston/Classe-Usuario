package exercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author charllistonadrianni
 */
public class Exercicio4 extends Usuario {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        List<Usuario> listaUsers = new ArrayList<Usuario>();
        List<Usuario> listaMaiores = new ArrayList<Usuario>();

        

        //Usuario maior = new Usuario();
        //System.out.print("Digite o sexo: ");
        //usuario.sexo = scann.next().charAt(0);
        //System.out.println("Sexo trocado = " + usuario.trocaSexo(usuario.sexo));

 
        //System.out.print("Digite a idade: ");
        //usuario.idade = scann.nextInt();
        //System.out.println("Nova idade = " + usuario.trocaIdade(usuario.idade));
           
            
        for (int i=1; i <= 5; i++) {
            Usuario user = new Usuario();

            System.out.println();
            
            System.out.print("Digite o nome do usuário " + i + ": ");
            user.setNome(scann.next());
                
            System.out.print("Digite a idade do usuário " + i + ": ");
            user.setIdade(scann.nextInt());
            
            System.out.print("Digite o sexo do usuário " + i + ": ");
            user.setSexo(scann.next().charAt(0));
            
            System.out.println();

            listaUsers.add(user);
            
            
            if (user.idade >= 18) {
                listaMaiores.add(user);
            }                 
        }
        System.out.println("lista de usuários: " +listaUsers);
        System.out.println("lista de usuários maiores de 18 anos: " +listaMaiores);
    } 
}

     

