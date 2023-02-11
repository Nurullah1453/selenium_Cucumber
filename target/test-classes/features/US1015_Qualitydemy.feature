
  Feature:US1015

    Scenario: TC21

      Given kullanici "qdUrl" anasayfaya gider
      Then cookie varsa kabul eder
      Then ilk sayfa login linkine click yapar
      When kullanici kutusuna "qdGecerliUsername" yazar
      Then password kutusuna "qdGecerliPassword" yazar
      Then login butonuna basar
      Then qd arama kutusuna "Java" yazip gonderir
      When java kursunu secerek sepete ekler
      Then urunun sepete eklendigi test edilir
      Then urunu listeden cikarir
      When urunun listeden cikarildigi test eder






