/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv;

/**
 *
 * @author uniflualves
 */
public class Cachorro extends Animal{

    

    public Cachorro(double peso, int idade) {
        super(peso, idade);
    }

    
    
    
    @Override
    public void fala(){
        System.out.println("AU!");
    }
}
