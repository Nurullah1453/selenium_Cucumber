
Feature: US1008 Scenario Outline ile birden fazla data icin test calistirma

  Scenario Outline: TC13 Scenario Outline ile amazonda arama yapilabilmeli

    #Amazona gidelim nutella,java,samsung ve apple icin arama yapıp
    #arama sonuclarının aradıgımız kelimeyi icerdigini test edelim
    
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir
    And arama sonuclarinin "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |arananUrun|
    |Nutella   |
    |Java      |
    |Samsung   |
    |Apple     |