/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.futebol;

/**
 *
 * @author Windows
 */
public class Time {
    
    public int partidasSemPerder;
    public String jogador;
    public String estadio;
    public String time;
    public int partidas;
    
    public Time(int partidasSemPerder, String estadio, String time, int partidas){
        this.partidasSemPerder=partidasSemPerder;
        this.estadio=estadio;
        this.time=time;
        this.partidas=partidas;
    }
    public void imprimirTime(String time1,String time2){
        System.out.println("Hoje o jogo é "+time1+" X "+time2+" que jogam no "+estadio+" e o "+time1+" ja esta a "+partidasSemPerder+" jogos sem perder");
    }  
}
