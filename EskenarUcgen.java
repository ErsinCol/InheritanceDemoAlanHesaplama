public class EskenarUcgen extends Sekil{
    private int kenar;
    //constructor
   public EskenarUcgen(double konumX,double konumY,String renk,int kenar){
       super(konumX,konumY,renk);
       this.kenar=kenar;
   }
   //getter and setter method
    public int getKenar(){
       return kenar;
    }
    public void setKenar(int kenar){
       this.kenar=kenar;
    }
    @Override
    public double alanHesapla(){
        return  Math.pow(getKenar(),2)*(Math.sqrt(3)/4.0);
    }
}
