Feature: Flow buy ticket flight for user as guest
  Scenario: User access tiketcom
    When User access home page tiketcom
    And System display home page tiketcom
    And System display icon pesawat
    And User click icon pesawat
    And System display "Mau ke mana?" page

  Scenario: User set time to flight and find
    When User click icon pesawat
    And User click sekali jalan
    And User choose jakarta on field dari
    And User choose surabaya on field ke
    And User choose 30 September 2020 on field tanggal berangkat
    Then User choose 1 penumpang ekonomi on field penumpang
    And User click button cari penerbangan

  Scenario: User choose airlines
    When System display pilih penerbangan pergi page
    Then User choose langsung on filter by transit
    And User choose 06 to 12 on filter by waktu
    And User choose garuda indonesia on filter by maskapai
    And User choose garuda indonesia which time of departure is "11:10"

  Scenario: User input order details
    When System display detail pemesanan page
    Then User choose tuan on field titel
    And User input "Fahmi Ramansyah" on field nama lengkap
    And User input "fahminyobatiket@mailinator.com" on field email
    And User input "81599988813" on field nomor telepon
    And User switch on sama dengan pemesan
    And User click button lanjut ke pembayaran
    And User click ya lanjutkan

  Scenario: User choose BCA virtual account on payment metode
    When System display metode pembayaran page
    And System display total pembayaran is "IDR 1.426.200" on metode pembayaran page
    And User choose bca virtual account
    Then System display bca virtual account details page
    And System display total pembayaran is "IDR 1.426.200" on bca virtual account details page
    And User click button lanjutkan on bca virtual account details page
    And System display countdown timer
    And User click button saya sudah membayar
    And User click button ke my order
    And System display cek pesanan page






