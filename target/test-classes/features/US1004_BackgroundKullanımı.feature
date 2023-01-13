
Feature: US1004 Kullanıcı bastaki ortak adımlar icin Background kullanır

  Background: Tum scenario'lar icin ortak ilk adım
    Given kullanici amazon anasayfaya gider

  Scenario: TC03 Kullanıcı parametreli method ile nutella aratır


    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir

    @p2
  Scenario: TC04 Kullanıcı parametreli method ile Java aratır


    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  Scenario: TC05 Kullanıcı parametreli method ile Samsung aratır


    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsun" icerdigini test eder
    And sayfayi kapatir