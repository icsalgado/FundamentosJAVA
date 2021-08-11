/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author ICSalgado
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();//existe nextInt, nextFloat ...
        float nota = 8.5f; //ou (float) 8.5;
        System.out.println("nota: " +nota); //saida com concatenação
        System.out.printf("nota: %.2f\n", nota); //saida com concatenação e formatação
        System.out.format("nota: %f\n", nota);
        System.out.printf("nome: %s\n", nome);
    }
    
}
