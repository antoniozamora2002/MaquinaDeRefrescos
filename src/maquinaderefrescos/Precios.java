/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrescos;

/*  Pepsi 2.00
    cocacola 2.50
    Inka Kola 2.50
    Fanta 2.00
    Crusch 1.50
    Sprite 2.00
    Bigcola 1.00
    Agua sanluis 1.50*/

public class Precios {
    
    int Cantidad;
    double precioPepsi =2, precioCocaCola = 2.50, precioInka = 2.50, precioFanta = 2, precioCrusch= 1.5, precioSprite = 2, precioBigcola = 1, precioAgua = 1.5 ;
    double total;
    
    public double VentaPepsi(double Cantidad) {
        
        total = precioPepsi*Cantidad;
        return total;
    } 
    
    public double VentaCocaCola(int Cantidad) {
        
        total = precioCocaCola*Cantidad;
        return total;
    } 
    
    public double VentaInka(int Cantidad) {
        
        total = precioInka*Cantidad;
        return total;
    } 
    
    public double VentaFanta(int Cantidad) {
        
        total = precioFanta*Cantidad;
        return total;
    } 
    
    public double VentaCrusch(int Cantidad) {
        
        total = precioCrusch*Cantidad;
        return total;
    } 
    
    public double VentaSprite(int Cantidad) {
        
        total = precioSprite*Cantidad;
        return total;
    } 
    
    public double VentaBigcola(int Cantidad) {
        
        total = precioBigcola*Cantidad;
        return total;
    } 
    
    public double VentaAgua(int Cantidad) {
        
        total = precioAgua*Cantidad;
        return total;
    } 
    
}
