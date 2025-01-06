
public class Film {
    private String ad;
    private int sure;
    private String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void bilgiGoster() {
        System.out.println("Film: " + ad + ", Süre: " + sure + " dk, Tür: " + tur);
    }
}
