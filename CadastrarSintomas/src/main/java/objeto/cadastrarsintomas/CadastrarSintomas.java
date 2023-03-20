/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.cadastrarsintomas;

/**
 *
 * @author Windows
 */
public class CadastrarSintomas {

    public boolean dorDeCabeca;
    public double temperatura;
    public String pressao;
    public String nomeSintoma;
    public boolean cadastrado ;
    
    public   CadastrarSintomas ( boolean  dorcabecaa , double  temperaturaa , String  pressaoo , String  sintomaa ){
        this.dorDeCabeca = dorcabecaa ;
        this.temperatura = temperaturaa ;
        this.pressao = pressaoo ;
        this.nomeSintoma = sintomaa ;
        this.cadastrado = true ;
    }
    
    public  String  getSintomas (){
        String  retorno = "Com dor de cabeça: " + dorDeCabeca + "e com a temperatura: " +   temperatura + "O paciente tem: " + nomeSintoma ;
        return  retorno ;
    }
}
