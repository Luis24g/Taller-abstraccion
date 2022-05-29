/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.abstractobject;

/**
 *
 * @author LENOVO
 */
public class Proton extends Spaceship{
     /**
     * Se declaran las variables de la clase
     */
    int speed = 3;
    String tipo = "Proton";
    String cappacity = "100 toneladas";
    
    /**
     * constructor usando la clase abstracta
     * @param x 
     */
    public Proton(int x){
        super(x);
    }
    /**
     * 
     * Sobrecarga de metodos 
     */
    @Override
    public int accelerate() {
        this.setDistance(this.getDistance()-speed);
        return this.getDistance();
    }

    @Override
    void data() {
        System.out.println(tipo+" capacidad de carga: "+cappacity+" Velocidad: "+speed);
    }
    
}
