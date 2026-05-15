/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author uniflualves
 */
abstract class OperacaoMatematica {
    public abstract double calcular(double x, double y);
}

class Soma extends OperacaoMatematica{
    public double calcular(double x, double y){
        return x + y;
    };
}

class Subtracao extends OperacaoMatematica{
    public double calcular(double x, double y){
        return x - y;
    }
}
