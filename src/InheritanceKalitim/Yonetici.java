package InheritanceKalitim;

public class Yonetici extends Calisan { //SubClass
    /*
    - extends ifadesini yukarıdaki gibi kullandığımızda, "Calisan" sınıfı içerisindeki bütün özellik ve metodları
    Yonetici sınıfında kullanabiliyoruz.
    - Fakat yine de yoneticiye özgü bir constructor yazmamız gerekir!
     */
    private String sorumlu_kisi;                              // Yonetici sınıfa özgü değişken.
public Yonetici(String isim,int maas,String departman,String sorumlu_kisi) {      // Burada constructor oluşturunca yine hata veriyor bunu
    super(isim,maas,departman);                               // gidermek için "super" komutunu kullanmamız gerekir!
                                                              // bu hata BaseClass'daki değişkenlerin private olmasından kaynaklanır!
    this.sorumlu_kisi = sorumlu_kisi;                         // SubClass a eklenen değişkenler için super kullandıktan sonra ekstra tanımlama yapmamız gerekir!

}
@Override                                             // sadece bilgi vermek amaçlı kullanılır.
public void calis() {                                 //Metod override
    System.out.println("Yönetici Çalışıyor...");
}
@Override
    public void bilgileriGoster() {
        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maaş : "+getMaas());
        System.out.println("Departman : "+getDepartman());
         */
    super.bilgileriGoster();
    System.out.println("Sorumlu olduğu kişi : " + sorumlu_kisi);

    }





}
