public abstract  class Sekil { // base class
    /*
            soyut sınıflar soyut sınıftan nesne oluşturulamaz burada devreye polmorphism giricek
            bir imza methodumuz olucak heryerde kullanımı zorunlu olucak ve farklı şekillerde
            bu method override ediecek
     */
    private double konumX;
    private double konumY;
    private String renk;
    // constructor
    public Sekil(double konumX,double konumY,String renk){
        this.konumX=konumX;
        this.konumY=konumY;
        this.renk=renk;
    }

    // getter and setter methods
    public double getKonumX(){
        return konumX;
    }
    public void setKonumX(double konumX){
        this.konumX=konumX;
    }

    public double getKonumY() {
        return konumY;
    }

    public void setKonumY(double konumY) {
        this.konumY = konumY;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void konumDegistir(double x,double y){
        this.setKonumX(x);
        this.setKonumY(y);
    }

    // abstract method
    public abstract double alanHesapla(); // gerçekleme kısmı yok

    public String toString(){
        return "konumu: ("+this.getKonumX()+","+this.getKonumY()+") -rengi: "+this.getRenk();
    }
}
