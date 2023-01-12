
Feature: US1009 Yanlis kullanici adi ve sifre password listesi ile negatif login testi

  Scenario Outline: TC14 Yanlis kullanici listesi ile giris yapilamamali.
    
    Given kullanici "qdUrl" anasayfaya gider
    And cookie varsa kabul eder
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And login butonuna basar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |yanlisUsername|yanlisPassword|
    |ilker         |ilkersad@a.com   |
    |Nurullah      |nuasdrullah@n.com|
    |Yasar         |yaasdsar@c.com   |
    |merve         |mersadve@m.com   |
    |sedef         |sedef@s.com      |
