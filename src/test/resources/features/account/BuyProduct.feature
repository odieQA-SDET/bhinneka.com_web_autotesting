Feature: Customer feature in https://www.bhinneka.com/
  As a member at https://www.bhinneka.com/
  I want to choose the product with 3 Steps of Scenario Testing:
    a. Produk dari hasil pencarian dengan manipulasi jumlah produk pada halaman
       produk detail dan halaman keranjang
    b. Produk dari daftar kategori dengan manipulasi filter pada daftar produk
    c. Produk dari flash sale (Murah Of The Day) dengan minimal dua produk di
       keranjang
  So that I can buy some products at bhinneka.com


  Scenario: Buy The Product Success of Search Product
    Given I was on the Login page
    When I filled my email correctly
    When I clicked 'Selanjutnya' button
    When I filled my Password correctly
    When I clicked 'Masuk' button masuk
    When I have been on the homepage of bhinneka.com as member
    And I have inputed "Kain Lap" at search product
    And I have selected and clicked the 'product' that I need
    And I went to detail product page
    And I have set 'clickadd' the mount of product that I bought
    And I clicked 'Tambah ke Keranjang' button in detail page of cart
    And I clicked 'Kembali Belanja atau Lanjut Ke Keranjang' button on pop up box of Tambahkan ke keranjang
    And I went to keranjang belanja page
  #Scenario: Buy The Product Success of Product Category Filter
    And I clicked Mouseover 'MenuTree' button Icon to buy category based
    And I cLicked 'Office & Store Supplies' maincategory
    And I choosen and clicked 'Printer' subcategory
    And I clicked 'EPSON' radio button of the filter of Merek
    And I clicked 'Jakarta Pusat' radio button of the filter of Lokasi
    And I inputed '2500000' box of the filter of Harga with Maximum Price
    And I clicked the 'product' that I filtered
    And I went to detail product page next
    And I clicked 'Tambah ke Keranjang' button in detail page
    And I clicked 'Kembali Belanja atau Lanjut Ke Keranjang' button on pop up box of keranjang
    And I went to keranjang belanja category based by filter
  #Scenario: Buy The Product Success of  flash sale (Murah Of The Day) Products
    # gg bisa diakses sebelumnya sukses ditesting utk 2 produk dan setelah dihapus di keranjang
      # mau testing lagi akses internet saya pada RTO parah, membuat testing sangat terganggu.
    And I clicked 'Logo of BHINNEKA' Icon to buy flash sale products
    And I cLicked 'Lihat Semua' button of flash sale
    And I choosen and clicked 'Tissue' Image
    And I clicked 'Tambah ke Keranjang' button in detail page of Tissue
    And I clicked 'Kembali Belanja atau Lanjut Ke Keranjang' button of pop up box to checkout
    And I went to keranjang belanja flash sale based
    And I clicked 'Logo of BHINNEKA' Icon to buy flash sale products
    And I choosen and clicked 'Ultra Milk' Image of flash sale
    And I clicked 'Tambah ke Keranjang' button in detail page of Ultra Milk
    And I clicked 'Kembali Belanja atau Lanjut Ke Keranjang' button of pop up box
    And I went to keranjang belanja flash sale based more
    And I got the Stop Testing of Document Requirement Based and Logout
    And I Clicked icon 'People' button
    And I clicked 'Log Out' button in menu dropp down of icon People
    Then I Went to Homepage of The Bhinneka.com as not member


