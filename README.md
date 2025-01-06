
# Sinema Müşteri Kayıt Sistemi

Bu proje, bir sinema sistemi için müşteri, film ve salon kayıtlarını yöneten bir Java uygulamasıdır. 
Aşağıdaki talimatları izleyerek projeyi çalıştırabilir ve sistemi kullanabilirsiniz.

## Proje Yapısı

Proje aşağıdaki sınıflardan oluşur:

1. **BaseEntity**: Ortak özellikleri barındıran soyut sınıf.
2. **IKayit**: `kaydet()` metodunu zorunlu kılan bir interface.
3. **Musteri**: Müşteri bilgilerini tutar.
4. **Film**: Film bilgilerini tutar (isim, süre, tür).
5. **Salon**: Salon bilgilerini, oynatılan filmi ve müşteri listesini yönetir.
6. **Main**: Uygulamayı çalıştıran ana sınıf.

1. Konsol Menüsü

   Uygulama çalıştırıldığında aşağıdaki menü görüntülenir:

   - 1: Filmleri Listele - Sistemde tanımlı filmleri ve bilgilerini görüntüler.
   - 2: Salonları Listele - Her salon ve oynatılan film bilgilerini görüntüler.
   - 3: Bir Salondaki Müşterileri Listele - Seçilen salona ait müşteri listesini görüntüler.
   - 4: Çıkış - Uygulamadan çıkış yapar.

 Geliştirme Detayları

- **Polymorphism**: `bilgiGoster()` metodu `BaseEntity` sınıfında tanımlanmış ve `Musteri` ve `Salon` sınıflarında override edilmiştir.
- **Interface Kullanımı**: `IKayit` interface’i `Musteri` ve `Salon` sınıfları tarafından uygulanmıştır.


