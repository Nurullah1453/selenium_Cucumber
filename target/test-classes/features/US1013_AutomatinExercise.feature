@wip
Feature: US1013 Automation exercise sitesinde kullanici olusturma

  Scenario: TC18 Kullanici AutomationExercise sayfasinda kullanici olusturabilmeli


    Given kullanici "automationUrl" anasayfaya gider
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin