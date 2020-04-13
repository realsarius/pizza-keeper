package sample;

public class Account {

    private String kullanici_adi;
    private String kullanici_sifre;

    public Account() {
        System.out.println("Lutfen kullanici adi ve sifresi girin");
    }

    public Account(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
        System.out.println("Lutfen sifrenizi girin");
    }

    public Account(String kullanici_adi, String kullanici_sifre) {
        this.kullanici_adi = kullanici_adi;
        this.kullanici_sifre = kullanici_sifre;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getKullanici_sifre() {
        return kullanici_sifre;
    }

    public void setKullanici_sifre(String kullanici_sifre) {
        this.kullanici_sifre = kullanici_sifre;
    }

}
