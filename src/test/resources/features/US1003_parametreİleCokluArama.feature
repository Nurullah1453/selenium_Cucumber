
Feature: US1003 Kullanıcı parametre olarak girilen degerleri aratır


  Scenario: TC03 Kullanıcı parametreli method ile nutella aratır

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir

    Scenario: TC04 Kullanıcı parametreli method ile Java aratır

      Given kullanici amazon anasayfaya gider
      Then amazon arama kutusuna "Java" yazip aratir
      And arama sonuclarinin "Java" icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 Kullanıcı parametreli method ile Samsung aratır

        Given kullanici amazon anasayfaya gider
        Then amazon arama kutusuna "Samsung" yazip aratir
        And arama sonuclarinin "Samsun" icerdigini test eder
        And sayfayi kapatir