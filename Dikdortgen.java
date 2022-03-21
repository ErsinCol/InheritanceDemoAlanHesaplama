public class Dikdortgen extends Sekil{
    private float uzunluk;
    private float genislik;
    // constructor
    public Dikdortgen(double konumX,double konumY,String renk,float uzunluk,float genislik){
        super(konumX,konumY,renk);
        this.genislik=genislik;
        this.uzunluk=uzunluk;
    }
    // getter and setter method
    public float getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(float uzunluk) {
        this.uzunluk = uzunluk;
    }

    public float getGenislik() {
        return genislik;
    }

    public void setGenislik(float genislik) {
        this.genislik = genislik;
    }
    //abstract method
    @Override
    public double alanHesapla(){
        return this.genislik*this.uzunluk;
    }
}
