
package carro;

 class Carro {
     private String modelo, cor;
     private int ano;
     private float preco, km;
     
     
     public void setModelo(String modelo){
         this.modelo = modelo;
     }
     
     public void setCor(String cor){
         this.cor = cor;
     }
     
     public void setAno(int ano){
         this.ano = ano;
     }
     
     public void setPreço(float preco){
         this.preco = preco;
     }
     
     public void setKm(float km){
         this.km = km;
     }
     
     public Carro(){
         
     }
     public Carro(String modelo, int ano, float preco){
         this.modelo = modelo;
         this.ano = ano;
         this.preco = preco;
     }
     
     public Carro(String modelo, String cor, int ano, float preco, float km){
         this.modelo = modelo;
         this.cor = cor;
         this.ano = ano;
         this.preco = preco;
         this.km = km;
     }
     
     public String getModelo(){
         return modelo;
     }
     
     public String getCor(){
         return cor;
     }
     
     public int getAno(){
         return ano;
     }
     
     public float getPreco(){
         return preco;
     }
     
     public float getKm(){
         return km;
     }
     
     @Override
     public String toString(){
         return "\nModelo=" + modelo + "\nCor=" + cor + "\nAno=" + ano +
                 "\nPreco=" + preco + "\nKm=" + km;
     }
     
    
}
