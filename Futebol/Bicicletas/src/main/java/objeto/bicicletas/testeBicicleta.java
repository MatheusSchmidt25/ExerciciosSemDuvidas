/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.bicicletas;

/**
 *
 * @author Windows
 */
public class testeBicicleta {
    public static void main(String[]args){
        Bicicletas b1 = new Bicicletas("urbana",40,"disco");
        b1.setpesotamanho(20,70);
        b1.setseriefreio(43362, "abs");
        
        Bicicletas b2 = new Bicicletas("Trilha",40,"abs");
        b2.setpesotamanho(35, 100);
        b2.setseriefreio(4367367,"disco");
        
        Bicicletas b3 = new Bicicletas("eletrica",67,"disco");
        b3.setpesotamanho(15,65);
        b3.setseriefreio(89678,"abs");
        
        Bicicletas b4 = new Bicicletas("passeio",37,"abs");
        b4.setpesotamanho(55, 110);
        b4.setseriefreio(245235,"disco");
        
        for(int i=0;i<4;i++){
            System.out.println(" Começo "+i);
            b1.imprimirBicicleta();
            b2.imprimirBicicleta();
            System.out.print("Final: "+i);
        }
    }
    
}
