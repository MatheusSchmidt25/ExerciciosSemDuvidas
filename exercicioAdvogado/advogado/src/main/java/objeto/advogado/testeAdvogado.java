/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.advogado;

/**
 *
 * @author Windows
 */
public class testeAdvogado {
    public static void main(String[]args){
        Advogado ad1 = new Advogado("Matheus",34);
        Advogado ad2 = new Advogado("Carlos",44);
        Advogado ad3 = new Advogado("Paulo",36);
        Advogado ad4 = new Advogado("Tulio",55);
        Advogado ad5 = new Advogado("Vanessa",33);
        Advogado ad6 = new Advogado("Maria",26);
        ad6.setAltura(1.90);
        ad6.setCpf(1234);
        ad6.setEndereco("Rua general osorio");
        ad6.setPeso(76);
        ad6.retorna();
        Advogado ad7 = new Advogado("Maressa",55);
        ad7.setAltura(1.66);
        ad7.setCpf(5678);
        ad7.setEndereco("Rua Ipiranga");
        ad7.setPeso(80);
        ad7.retorna();
        Advogado ad8 = new Advogado("Samantha",60);
        ad8.setAltura(1.70);
        ad8.setCpf(9876);
        ad8.setEndereco("Rua av Brasil");
        ad8.setPeso(60);
        ad8.retorna();
        
        
    }
}
