# Rapor

**Ad Soyad:Naz Kuruçay**
**Numara:663**

## 1. Problemin Açıklaması
<!-- Problemi kendi cümlelerinizle yazın. -->
10 katlı bir asansörün nasıl çalışacağını anlatan bir algoritma hazırladım Kullanıcıdan bulunduğu katı ve gitmek istediği katı alıyoruz. Daha sonra asansörün hangi yöne gideceğini ve kaç kat ilerlemesi gerektiğini hesaplıyoruz. Girilen katlar geçerli değilse hata mesajı gösteriyoruz.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
Mevcut kat bilgisi(x),
Hedef kat bilgisi(y)

**İşlemler:**
y>x ise yukarı yönde hareket et,
x>y ise aşağı yönde hareket et,
x=y ise hareket etme.
**Çıktılar:**
Hareket yönü,
Hareket mesafesi,
işlem sonucu,
mevcut kat,
hedef kat

## 3. Sözde Kod (Pseudocode)

```BAŞLA
1.Kullanıcıdan mevcut katı al.
2.Kullanıcıdan hedef katı al.
3.Mevcut katın 1 ile 10 arasında olup olmadığını denetle.
4.Hedef katın 1 ile 10 arasında olup olmadığını denetle.
5.Eğer mevcut kat veya hedef kat geçersizse hata mesajı yazdır.
6.Eğer değilse :
 Hedef kat mevcut kattan büyükse yukarı yönde çık.
 Hedef kat mevcut kattan küçükse aşağı yönde çık.
 İki kat birbirine eşitse hareket etme.
7.İki kat arasındaki farkı hesapla.
8.Mevcut kat,hedef kat,yönü ve mesafeyi yazdır.
9.İşlem sonucunu ekrana yazdır.
BİTİR
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)




## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | 5 kat yukarı | Evet |
| 9 | 2 | 7 kat aşağı | 7 kat aşağı | Evet |
| 5 | 5 | Hareket yok | Hareket yok | Evet |
| 1 | 10 | 9 kat yukarı | 9 kat yukarı | Evet |
| 10 | 1 | 9 kat aşağı | 9 kat aşağı | Evet |
| 0 | 5 | Geçersiz mevcut kat | Geçersiz mevcut kat | Evet |
| 5 | 11 | Geçersiz hedef kat | Geçersiz hedef kat | Evet |
| -2 | 4 | Geçersiz mevcut kat | Geçersiz mevcut kat | Evet |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

