/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author uniflualves
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovableCircle circulo01 = new MovableCircle(0, 0, 1, 1, 5);
        MovablePoint ponto01 = new MovablePoint(5, 5, 2, 2);
        
        circulo01.moveUp();
        circulo01.moveUp();
        circulo01.moveLeft();
        System.out.println(circulo01.toString());
        
        circulo01.getCenter().x  = 0;
        circulo01.getCenter().y = 0;
        circulo01.getCenter().xSpeed = 2;
        circulo01.getCenter().ySpeed = 2;
        System.out.println(circulo01.toString());
        
        circulo01.moveUp();
        circulo01.moveUp();
        circulo01.moveLeft();
        System.out.println(circulo01.toString());
    }
    
    
    
}
