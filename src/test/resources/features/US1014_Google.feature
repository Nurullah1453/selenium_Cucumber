@wip
Feature: US1014

  Scenario: TC19

    Given Kullanici google sayfasina gider
    Then  Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
    Then  Para birimlerinin karsilastirmasini alir
    And Verilen degerlerin ikiden kucuk oldugunu dogrular