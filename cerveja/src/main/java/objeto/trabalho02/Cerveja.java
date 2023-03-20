/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.trabalho02;

/**
 *
 * @author Windows
 */
public class Cerveja {
    public static void main(String[]args){
        Trabalho02 cerveja1 = new Trabalho02(13585);
        Trabalho02 cerveja2 = new Trabalho02(56489590);
        Trabalho02 cerveja3 = new Trabalho02(458358);
        Trabalho02 cerveja4 = new Trabalho02(123423);
        Trabalho02 cerveja5 = new Trabalho02(998877);
        
        cerveja1.setStatus("\nPilsem", "Brahma", "22", 22, "Ambev");
        cerveja2.setStatus("\nPilsem", "Hainekem", "34", 540, "Ambev");
        cerveja3.setStatus("\nPilsem", "Burguesa", "2", 23, "Ambev");
        cerveja4.setStatus("\nPìlsem","Skol","3",44,"Ambev");
        cerveja5.setStatus("\nPilsem", "Quilmes","4", 34, "Ambev");
        
        cerveja1.imprimir();
        cerveja2.imprimir();
        cerveja3.imprimir();
        cerveja4.imprimir();
        cerveja5.imprimir();
    }
}
