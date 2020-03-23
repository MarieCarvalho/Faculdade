/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author wolley
 * 
 * @author Mariane 
 * 
 * 
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comNome("Mariane Carvalho")
                .comCPF("123.765.891-00")
                .nascidoEm("21/12/1999")
                .comRG("25025125-x")
                .doSexo('F')
                .doEndereco("12345-490", "Av Joao XXIII", 123, "Mogi das Cruzes", "SP")
                .comAltura(1.53)
                .comPeso(57)
                .comTipoSanguineo("O")
                .constroi();
        
        System.out.println(paciente);
        
    }
    
}
