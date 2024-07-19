package Composition;

public class Monitor {

    private String model;

    private String uretici;

    private String boyut;

    private Resolution cozunurluk;

    public Monitor(String model, String uretici, String boyut, Resolution cozunurluk) {

        this.model = model;

        this.uretici = uretici;

        this.boyut = boyut;

        this.cozunurluk = cozunurluk;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getCozunurluk() {
        return cozunurluk;
    }

    public void setCozunurluk(Resolution cozunurluk) {
        this.cozunurluk = cozunurluk;
    }

    public void monitoru_kapat(){

        System.out.println("Monitor kapatılıyor...");

    }
}
