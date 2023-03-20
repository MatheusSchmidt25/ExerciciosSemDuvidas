/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.cadastrarsintomas;

/**
 *
 * @author Windows
 */
public class paciente {
    private String nome;
    private int idade;
    private String sexo;
    private String convenio; 
    public String sintoma;
    
    
    public void setPaciente(String nomee, int idadee, String sexoo, String convenioo){
        this.nome = nomee;
        this.idade = idadee;
        this.sexo = sexoo;
        this.convenio = convenioo;
    }
    
    public void setSintoma(String aSintoma){
        this.sintoma = aSintoma;
    }
}
