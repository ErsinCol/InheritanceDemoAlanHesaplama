public class Daire  extends  Sekil{
    private float yaricap;
    // constructor
    public Daire(double konumX,double konumY,String renk,float yaricap){
        super(konumX,konumY,renk);
        this.yaricap=yaricap;
    }
    // getter and setter methods
    public float getYaricap(){
        return yaricap;
    }
    public void setYaricap(float yaricap){
        this.yaricap=yaricap;
    }
    @Override
    public double alanHesapla() {
        return Math.pow(yaricap,2)*Math.PI;
    }
}
