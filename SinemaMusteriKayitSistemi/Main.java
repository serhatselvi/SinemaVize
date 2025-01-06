
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Örnek veriler oluşturma
        Film film1 = new Film("Avengers", 212, "Komedimsi");
        Film film2 = new Film("Venom", 124, "Romantik");

        Salon salon1 = new Salon(1, "Salon 1");
        salon1.setOynatilanFilm(film1);

        Salon salon2 = new Salon(2, "Salon 2");
        salon2.setOynatilanFilm(film2);

        Musteri musteri1 = new Musteri(1, "Ahmet");
        Musteri musteri2 = new Musteri(2, "Mehmet");

        salon1.musteriEkle(musteri1);
        salon2.musteriEkle(musteri2);

        // Menüyü görüntüleme
        while (true) {
            System.out.println("\n1- Filmleri Listele");
            System.out.println("2- Salonları Listele");
            System.out.println("3- Bir Salondaki Müşterileri Listele");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    film1.bilgiGoster();
                    film2.bilgiGoster();
                    break;
                case 2:
                    salon1.bilgiGoster();
                    salon2.bilgiGoster();
                    break;
                case 3:
                    System.out.print("Salon ID girin: ");
                    int salonId = scanner.nextInt();
                    if (salonId == 1) {
                        salon1.musterileriListele();
                    } else if (salonId == 2) {
                        salon2.musterileriListele();
                    } else {
                        System.out.println("Geçersiz salon ID!");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
