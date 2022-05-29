/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.abstractobject;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Se inician las variables. target guardara el destino de la nave, type
         * guardara la elección del usuario.
         */
        int target;
        int type=0;
        Spaceship spaceship= null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********SELECCIONE EL Destino***********");
        System.out.println("0. Luna\n1. Marte\n2. Venus\n3.Jupiter\n4. Saturno\n5. Neptuno\n6. Plutón\n7. Salir");
        System.out.println("******************************************");
        
        /**
         * Bloque try para asegurarse que el usuario digite un valor dentro de los parametros
         * queridos.
         */
        try{
            target=scanner.nextInt();
             if(target>=0&&target<7){
        
        System.out.println("********SELECCIONE EL TIPO DE NAVE********");
        System.out.println("1. Lanzadera\n2. No tripulada\n3. Tripulada\n4.Salir");
        System.out.println("******************************************");
        try{
        type=scanner.nextInt();
        }catch(Exception e){
        System.out.println(e);}
        if(type<4&&type>=1){
            
        /**
         * Polimorfismo dinamico según la elección del usuario.
         */
        switch(type){
            case 1:
                System.out.println("1. Delta IV\n2. Proton");
                try{
                type=scanner.nextInt();
                switch(type){
                    case 1:
                        spaceship= new DeltaIV(target);
                        break;
                    case 2:
                        spaceship= new Proton(target);
                        break;
                }
                }catch(Exception e){
                System.out.println("Opción no valida");
                }
                break;
            case 2:
                 System.out.println("1. Explorer\n2. Sputnik");
                try{
                type=scanner.nextInt();
                switch(type){
                    case 1:
                        spaceship = new Explorer(target);
                        break;
                    case 2:
                        spaceship = new Sputnik(target);
                        break;
                }
                }catch(Exception e){
                System.out.println("Opción no valida");
                }
                break;
            
            case 3:
                 System.out.println("1. Apolo\n2. Mercury");
                try{
                type=scanner.nextInt();
                switch(type){
                    case 1:
                        spaceship = new Apolo(target);
                        break;
                    case 2:
                        spaceship = new Mercury(target);
                        break;
                }
                }catch(Exception e){
                System.out.println("Opción no valida");
               
                }
                break;    
        
            }
        
         }
        
        /**
         * Ciclo while para ejecutar el metodo accelerate para llegar al destino
         * de la nave
         */
        try{
        boolean flightOff=false;
        boolean exit= false;
        int distance=spaceship.getDistance();
        while(distance>0&&exit==false){
            if(flightOff==false){
            System.out.println("********************");
            System.out.println("1.Despegar\n2.salir");
            System.out.println("********************");
            type=scanner.nextInt();
            if(type==1){
            flightOff=true;
            }else if(type==2){
            exit=true;
            continue;
                }
            }
            System.out.println("Distancia del destino: "+distance);
            spaceship.data();
            System.out.println("1.Acelerar\n2.salir");
            System.out.println("********************");
            type=scanner.nextInt();
            
            if(type==1){
                distance=spaceship.accelerate();
                if(distance<=0){
                System.out.println("FELICIDADES HA LLEGADO A SU DESTINO");
                exit=true;
                }
            }else if(type==2){
            exit=true;
            }
            
        }
        
        
        }catch(Exception e){
        System.out.println(e);
        }
       }
            System.out.println("Aplicación terminada");
        }catch(Exception e){
        System.out.println("No elijió una opción valida");
        }
        
       
    }
    
}
