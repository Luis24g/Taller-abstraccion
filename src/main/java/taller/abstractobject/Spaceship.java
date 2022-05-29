/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.abstractobject;

/**
 * Clase abstracta para contrsuir las naves.
 * @author LENOVO
 */
public abstract class Spaceship {
    /**
     * se declaran las variables, el arreglo course simboliza los planetas destino y su distancia
     * 
     */
    
    private int[] course = {4,5,6,7,8,9,10};
    private int distance;
   
    
    public Spaceship(int x){
        
        this.setDistance(this.getCourse(x));
    }
    
    abstract int accelerate();
    
    abstract void data(); 

    /**
     * @return the course
     */
    public int getCourse(int x) {
        return course[x];
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
}
