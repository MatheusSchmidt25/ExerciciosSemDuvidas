/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.futebol;

/**
 *
 * @author Windows
 */
public class principal {
    public static void main(String[]args){
        Futebol jo1 = new Futebol("Sergio Ramos",33,80,1.85,"Zagueiro");
        Futebol jo2 = new Futebol("Neymar Jr",31,78,1.73,"Atacante");
        Futebol jo3 = new Futebol("Robinho",40,68,1.70,"Atacante");
        Futebol jo4 = new Futebol("Pasal",63,50,1.50,"Zagueiro");
        Futebol jo5 = new Futebol("Tafarel",44,86,1.85,"Goleiro");
        
        
        Time ti1 = new Time(8,"Bernabeu","Barcelona",7);
        Time ti2 = new Time(5,"Maracana","Flamengo",5);
        
        
        ti1.imprimirTime(ti1.time,ti2.time);
       
    }
}
