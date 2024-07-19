package Polymorphism;
// - Polymorphism : bir nesnenin birden farklı nesne gibi davranması.
// Public kullanmazsak bir java dosyasında birden fazla class kullanabiliriz.

class Hayvan {

    private String isim;

    public Hayvan(String isim) {

        this.isim = isim;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan Konuşuyor";
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);

    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }

}


class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);

    }

    @Override
    public String konus() {
        return getIsim() + " Havlıyor...";
    }
}

class At extends Hayvan {
    public At(String isim) {

        super(isim);

    }
    @Override
    public String konus() {
        return getIsim() + " Kişniyor...";
    }
}




public class Main {

    public static void main(String[] args) {


        Hayvan karabas = new Kopek("Karabaş");
        konustur(karabas);

        Hayvan lokum = new Kedi("Lokum");
        konustur(lokum);

        Hayvan düldül = new At("Düldül");
        konustur(düldül);

        if (karabas instanceof Kopek) {

            System.out.println("karabas Kopek sınıfına aittir...");

        }
        else {
            System.out.println("Kopek sınıfına ait değildir.");
        }

        if (lokum instanceof Kopek) {

            System.out.println("karabas Kopek sınıfına aittir...");

        }
        else {
            System.out.println("Kopek sınıfına ait değildir.");
        }






    }



    public static void konustur (Hayvan hayvan) {

        System.out.println(hayvan.konus());

    }
}
