/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.trabalho02;

/**
 *
 * @author Windows
 */
public class Trabalho02 {

    public String tipo;
    public String marca;
    public String teorAlcolico;
    public double preco;
    
    private int codigo;
    private String fabricante;
    
    public Trabalho02(int codigoo){
        this.codigo=codigoo;
    }
    
    public void setStatus(String tipoo, String marcaa,String teorAlcolicoo, double precoo, String fabricantee){
        this.tipo=tipoo;
        this.marca=marcaa;
        this.teorAlcolico=teorAlcolicoo;
        this.preco=precoo;
        this.fabricante=fabricantee;
    }
    public int getcodigo(){
        return this.codigo;
    }
    
    public void imprimir(){
        System.out.println("\nMarca da cerveja: "+marca);
        System.out.println("Tipo da cerveja: "+tipo);
        System.out.println("Teor Alcoolico: "+teorAlcolico);
        System.out.println("Preço: "+preco);
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Coodigo: "+codigo);
                
    }
    
}
