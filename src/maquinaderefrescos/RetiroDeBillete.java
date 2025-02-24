/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrescos;

/**
 *
 * @author Antonio
 */
public class RetiroDeBillete {
    
    int DineroAlmacenado = 500, Retiro;
    
    public int Retirar(int Cantidad){
        
       Retiro = DineroAlmacenado - Cantidad;
       
       return Retiro;
        
    }
}
