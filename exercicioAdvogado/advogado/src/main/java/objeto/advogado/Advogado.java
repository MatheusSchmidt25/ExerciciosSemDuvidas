/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.advogado;

/**
 *
 * @author Windows
 */
public class Advogado {

   public String nome;
   public int idade;
   
   private double altura;
   private int peso;
   private int cpf;
   private int telefone;
   private String endereco;
   
   public Advogado(String nomee, int idadee){
        this.nome=nomee;
        this.idade=idadee;
    }
   
   
   public void setAltura(double alturaa){
       this.altura=alturaa;
   }
   
   public void setPeso(int pesoo){
       this.peso=pesoo;
   }
   
   public void setCpf(int cpff){
       this.cpf=cpff;
   }
   
   public void setTelefone(int telefonee){
       this.telefone=telefonee;
   }
   
   public void setEndereco(String enderecoo){
       this.endereco=enderecoo;
   }
   
   public void retorna(){
       System.out.println("O advogado "+nome);
       System.out.println("A idade dele é "+idade);
       System.out.println("A sua altura é "+altura);
       System.out.println("O seu peso é "+peso);
       System.out.println("O seu cpf é "+cpf);
       System.out.println("O seu telefoone é "+telefone);
       System.out.println("O seu endereço é "+endereco+"\n\n");
   }
}
