/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author ICSalgado
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int idade = 30;
        String valor = Integer.toString(idade); //passo a variavel numerica para string
        String texto = "30";
        int valor2 = Integer.parseInt(texto);
        
        System.out.printf("%d",valor2);
    }   
    
    
}
