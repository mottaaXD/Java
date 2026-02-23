
package televisao;

public class Televisao {

    private String modelo;
    private float preco, tamanho;
    private int volume, canal;
    private boolean ligada;
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public void aumentarVolume(){
        this.setVolume(this.volume + 1);
    }
    
    public void diminuirVolume(){
        this.setVolume(this.volume - 1);
    }
    
    public void aumentarCanal(){
        this.setCanal(this.canal + 1);
    }
    
    public void diminuirCanal(){
        this.setCanal(this.canal - 1);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public float getTamanho(){
        return this.tamanho;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public boolean getLigada(){
        return this.ligada;
    }
    
    
    @Override
    public String toString(){
        return "Modelo="+modelo + "\nPreco=" + preco+ "\nTamanho=" + tamanho+
                "\nVolume=" + volume + "\nCanal=" + canal + "\nLigada=" + ligada;
    }
    
    
}
