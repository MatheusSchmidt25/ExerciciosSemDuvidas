/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.cadastrarsintomas;

/**
 *
 * @author Windows
 */
public class testeCadastrar {
        public static void main(String[] args) {
        CadastrarSintomas sintoma1 = new CadastrarSintomas(true,41.5,"18/9","AIDS");
        CadastrarSintomas sintoma2 = new CadastrarSintomas(false,35.5,"18/9","VIROSE");
        CadastrarSintomas sintoma3 = new CadastrarSintomas(true,38.5,"18/9","HEMORRAGIA");
        paciente paciente1 = new paciente();
        paciente1.setPaciente("Matheus", 25, "Masculino", "Amil");
        paciente1.setSintoma(sintoma1.nomeSintoma);
        paciente paciente2 = new paciente();
        paciente2.setPaciente("KLEBER", 18, "Masculino", "Amil");
        paciente2.setSintoma(sintoma2.nomeSintoma);
        paciente paciente3 = new paciente();
        paciente3.setPaciente("Maria", 25, "Feminino", "Prevent Senior");
        paciente3.setSintoma(sintoma3.nomeSintoma);
        paciente paciente4 = new paciente();
        paciente4.setPaciente("João", 25, "Masculino", "UNIMED");
        paciente4.setSintoma(sintoma1.nomeSintoma);
        paciente paciente5 = new paciente();
        paciente5.setPaciente("Maria", 25, "Feminino", "Boston");
        paciente5.setSintoma(sintoma2.nomeSintoma);
        paciente paciente6 = new paciente();
        paciente6.setPaciente("Joana", 25, "Feminino", "SUS");
        paciente6.setSintoma(sintoma3.nomeSintoma);
    }
    
}
