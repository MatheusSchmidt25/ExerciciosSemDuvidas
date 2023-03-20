/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.bicicletas;

/**
 *
 * @author Windows
 */
public class Bicicletas {

    public String modelo;
    public int qtdAro;
    public String freio;
    
    private int serie;
    private String pneu;
    
    private int peso;
    private int tamanho;
    
    public Bicicletas(String modeloo, int qtdAroo, String freioo){
        this.modelo=modeloo;
        this.qtdAro=qtdAroo;
        this.freio=freioo;
    }
    
    public void setseriefreio(int seriee, String pneuu){
        this.serie=seriee;
        this.pneu=pneuu;
    }
    
    public void setpesotamanho(int pesoo, int tamanhoo){
        this.peso=pesoo;
        this.tamanho=tamanhoo;
    }
    
    public void imprimirBicicleta(){
        System.out.println("O modelo é: "+modelo);
        System.out.println("Tem "+qtdAro+"aros");
        System.out.println("O tipo de freio é "+freio);
        System.out.println("A serie é "+serie);
        System.out.println("O pneu é "+pneu);
        System.out.println("O peso é: "+peso);
        System.out.println("O tamanha é: "+tamanho);
        
                
    }
    
}
