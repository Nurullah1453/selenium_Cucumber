
Feature: US1012 Window Testi

  Scenario: TC17 Kullanici yeni acilan window'u test edebilmeli

    Given kullanici "wduUrl" anasayfaya gider
    Then Login Portal elementine kadar asagi iner
    And Login Portal a tiklar
    Then Acilan yeni window a gecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then webUniversity login butonuna basar
    And Popup’ta cikan yazinin validation failed oldugunu test eder
    And Ok diyerek Popup’i kapatir
    Then Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
    Then acilan tum sayfalari kapatir


