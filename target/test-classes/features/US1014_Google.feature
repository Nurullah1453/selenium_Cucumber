@wip
Feature: US1014

  Background: arama yapilincaya kadar yapilacak islemler
    Given Kullanici google sayfasina gider

  Scenario: TC19

    Then  Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
    Then  Para birimlerinin karsilastirmasini alir
    And Verilen degerlerin ikiden kucuk oldugunu dogrular


  Scenario: TC20
    Then  Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer2
    Then  Para birimlerinin karsilastirmasini alir
    And Verilen degerlerin ikiden kucuk oldugunu dogrular

