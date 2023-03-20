/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.alunos;

/**
 *
 * @author Windows
 */
public class Alunos {

    public String nome;
    public int idade;
    public String sexo;
    public int peso;
    
    private int cpf;
    
    public Alunos(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    
    public void sexo(){
        System.out.println("O sexo dele(a) é "+sexo);
    }
    
    public void peso(){
        System.out.println("O peso dele(a) é "+peso);
    }
    
    public void cpf(){
        System.out.println("O cpf dele(a) é "+cpf);
    }
}
