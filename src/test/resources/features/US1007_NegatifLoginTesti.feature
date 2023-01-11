
Feature: Kullanıcı yanlis bilgilerle giris yapamaz

  Scenario: TC10 Gecerli kullanici adi gecersiz sifre ile negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then cookie varsa kabul eder
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir

  Scenario:TC11 Gecersiz kullanici adi ve Gecerli sifre ile Pozitif Login Testi

    Given kullanici "qdUrl" anasayfaya gider
    Then cookie varsa kabul eder
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir

  Scenario:TC12 Gecersiz kullanici adi ve sifre ile Pozitif Login Testi

    Given kullanici "qdUrl" anasayfaya gider
    Then cookie varsa kabul eder
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir