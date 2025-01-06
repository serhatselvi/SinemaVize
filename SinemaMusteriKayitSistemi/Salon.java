
import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity implements IKayit {
    private List<Musteri> musteriler;
    private Film oynatilanFilm;

    public Salon(int id, String name) {
        super(id, name);
        this.musteriler = new ArrayList<>();
    }

    public void setOynatilanFilm(Film film) {
        this.oynatilanFilm = film;
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon ID: " + id + ", Adı: " + name);
        if (oynatilanFilm != null) {
            System.out.println("Gösterilen Film: ");
            oynatilanFilm.bilgiGoster();
        }
    }

    public void musterileriListele() {
        System.out.println("Salon: " + name + " için müşteri listesi:");
        for (Musteri musteri : musteriler) {
            musteri.bilgiGoster();
        }
    }

    @Override
    public void kaydet() {
        System.out.println("Salon kaydedildi: " + name);
    }
}
