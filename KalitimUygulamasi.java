import java.util.Scanner;
import java.text.DecimalFormat;
public class KalitimUygulamasi {
    /*
            KALITIM

                Sınıfların diğer sınıflardan üretilmesine ve böylece kod tekrarının önlenmesine imkan verir
                benzer varlıklar arasında olmalıdır is a- is kind of
                türetilmiş sınıfa derived class temel sınıfın base classın üyelerine kalıtım yoluyla sahip olur

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        float yaricap=scanner.nextFloat();
        //Sekil sekil=new Daire(20,20,"sarı",yaricap); polymorphism
        Daire daire1=new Daire(20,20,"mavi",yaricap);
        System.out.println(daire1.toString());
        daire1.konumDegistir(30,50);
        System.out.println(daire1.toString());
        System.out.println(daire1.getKonumX());
        DecimalFormat decimalFormat=new DecimalFormat("0.##");
        System.out.println("Alan: "+decimalFormat.format(daire1.alanHesapla()));

    }
}
