
package labparte2;


public class Swapper {
    private double x, y;
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void swap(){
        double temp = x;
        x = y;
        y = temp;
        
    }
    
}
