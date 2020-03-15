package decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Pruebas {
    public static void main(String[] args) {
  

        Bus BusBasico = new ID ("Bus # 1 ",new Conductor(" Pepe molina ",new Descripcion(" Azul",new Caracteristicas (" Modelo 2016",new BusDetalle()))));

        System.out.println(BusBasico.getCaracteristicas());
                
    
    
}
}