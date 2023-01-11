@wip
  Feature:US1006 Kullanıcı configuration dosyasındaki bilgilerle login olabilmeli

    Scenario:TC09 Gecerli kullanici adi ve sifre ile Pozitif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then cookie varsa kabul eder
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecerliUsername" yazar
      And password kutusuna "qdGecerliPassword" yazar
      Then login butonuna basar
      And basarili giris yapildigini test eder
      Then sayfayi kapatir