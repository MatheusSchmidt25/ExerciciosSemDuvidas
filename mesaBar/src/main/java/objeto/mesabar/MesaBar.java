/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.mesabar;

/**
 *
 * @author Windows
 */
public class MesaBar {

    public int cerveja;
    public int shopp;
    public int qtdPessoas;
    public int porcao;
    public double valor;
    
    public  MesaBar(int cervejaa, int shoppp, int qtdPessoass, int porcaoo,double valorr){
        this.cerveja=cervejaa;
        this.shopp=shoppp;
        this.qtdPessoas=qtdPessoass;
        this.porcao=porcaoo;
        this.valor=valorr;
    }
    
    public void imprimir(){
        System.out.println("Seu pedido foi:");
        System.out.println(cerveja+" cervejas");
        System.out.println(shopp+" shops");
        System.out.println(porcao+" porcao");
        System.out.println("Para"+qtdPessoas+" pessoas ");
        System.out.println("O total foi de "+valor+" reais.\n\n");
        
    }
    
}
