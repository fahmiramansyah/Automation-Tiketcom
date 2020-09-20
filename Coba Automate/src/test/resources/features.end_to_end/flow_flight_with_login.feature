Feature: Flow buy ticket flight with Login
  Scenario: User access tiketcom and Login
    When User access home page tiketcom
    And System display home page tiketcom
    And System display icon pesawat
    And User click login
    And System display login page
    And User input "fahmitiket@mailinator.com" on field email login
    And User click button lanjutkan
    And User input "P@ssw0rd" on field password
    Then User click button login

#  ===================================tampil halaman kirim OTP, belum bisa lanjut=================================================================
#
#    And System display home page tiketcom
#    And System display icon pesawat
#    And System display "fc" on profil info
#
#  Scenario: User buy ticket flight
#    When User click icon pesawat