package StepDef;

import StepDefImpl.URL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefImpl.WebUtility.*;

public class HomePage {

    private LoginLogoutPage _loginLogoutPage;
    private URL _url = new URL();

    @Given("^User access home page tiketcom$")
    public void user_access_home_tiketcom() throws Exception {
        _url.getHome();
    }

    @When("^System display home page tiketcom$")
    public void system_display_home_page_tiketcom() throws Exception {
        waitForAction(1000);
        waitForElementVisible(By.id("app"));
    }

    @Then("^System display icon pesawat$")
    public void system_display_icon_pesawat() throws Exception {
        waitForAction(1000);
        waitForElementVisible(By.xpath("//*[@id=\"productWidget\"]/div[1]/div[2]/div[1]/div"));
    }

    @When("^User click icon pesawat$")
    public void user_click_icon_pesawat() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"productWidget\"]/div[1]/div[2]/div[1]/div"));
    }

    @Then("^User click login$")
    public void user_click_login() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/div[3]/div/div[2]/a[3]"));
    }

    @Then("^System display login page$")
    public void system_display_login_page() throws Exception {
        waitForAction(1000);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]"));
    }

    @Then("^User input \"([^\"]*)\" on field email login$")
    public void user_input_on_field_email_login(String email) throws Exception {
        waitForAction(1000);
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[1]/div[3]/div/div/input"), email);
    }

    @Then("^User click button lanjutkan$")
    public void user_click_lanjutkan() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[1]/div[4]/button"));
    }

    @Then("^User input \"([^\"]*)\" on field password$")
    public void user_input_on_field_password(String password) throws Exception {
        waitForAction(1000);
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[2]/div/form/div[2]/div/input"), password);
    }

    @Then("^User click button login$")
    public void user_click_button_login() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[2]/div/form/div[4]/button"));
    }

    @Then("^System display \"([^\"]*)\" on profil info$")
    public void system_display_on_profil_info(String akun) throws Exception {
        waitForAction(1000);
        Assert.assertEquals(getValue(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/div[4]/div/div[2]/div/span")), akun);
    }

    @Then("^System display \"([^\"]*)\" page$")
    public void system_display_page(String page) throws Exception {
        waitForAction(1000);
        Assert.assertEquals(getValue(By.xpath("//*[@id=\"productWidget\"]/div[1]/div[1]/span[2]")), page);
    }

    @When("^User click sekali jalan$")
    public void user_click_sekali_jalan() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"productWidget\"]/div[2]/div[1]/div[2]/div[1]/div/label"));
    }

    @When("^User choose jakarta on field dari$")
    public void user_choose_jakarta_on_dari() throws Exception {
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"fromInput\"]/div[1]/div"));
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"fromDropDownList-airport1\"]/div[1]/div[1]"));
    }

    @When("^User choose surabaya on field ke$")
    public void user_choose_surabaya_on_ke() throws Exception {
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"toInput\"]/div[1]/div"));
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"toDropDownList-airport2\"]/div[1]/div[1]"));
    }

    @When("^User choose 30 September 2020 on field tanggal berangkat$")
    public void user_choose_30_september_on_tanggal_berangkat() throws Exception {
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"startDate\"]/div[1]/div"));
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"startDate\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[4]/div/span"));
    }

    @When("^User choose 1 penumpang ekonomi on field penumpang$")
    public void user_choose_1_penumpang_ekonomi_on_penumpang() throws Exception {
        waitForAction(500);
        waitAndClick(By.id("productSearchPassengerCabin"));
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"passengerCabin\"]/div[2]/div/div/div[2]/div[2]/div[1]/div/div"));
        waitAndClick(By.xpath("//*[@id=\"passengerCabin\"]/div[2]/div/div/div[3]/div/span"));
    }

    @When("^User click button cari penerbangan$")
    public void user_click_button_cari_penerbangan() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"productWidget\"]/div[2]/div[3]/button"));
    }


    @When("^System display pilih penerbangan pergi page$")
    public void system_display_pilih_penerbangan_pergi_page() throws Exception {
        waitForAction(3000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]"));
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div"));
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div"));
    }

    @When("^User choose langsung on filter by transit$")
    public void user_choose_langsung_on_filter_transit() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div/div[1]/div/div[2]/div/div[2]/div/label"));
    }

    @When("^User choose 06 to 12 on filter by waktu$")
    public void user_choose_06_to_12_on_filter_waktu() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div/div[3]/div/div[2]/div/div[2]/div[3]/div/label"));
    }

    @When("^User choose garuda indonesia on filter by maskapai$")
    public void user_choose_garuda_indonesia_on_filter_maskapai() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div/div[4]/div/div[2]/div/div[4]/div[2]/label"));
    }

    @Then("^User choose garuda indonesia which time of departure is \"([^\"]*)\"$")
    public void system_choose_garuda_indonesia_which_time_of_departure_is(String time) throws Exception {
        waitForAction(1000);
        Assert.assertEquals(getValue(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div[3]/div[2]/div[2]/div[1]")), time);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div[1]/div"));
    }

    @When("^System display detail pemesanan page$")
    public void system_display_detail_pemesanan_page() throws Exception {
        waitForAction(1000);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div"));
    }

    @When("^User choose tuan on field titel$")
    public void user_choose_tuan_on_titel() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div[1]"));
        waitForAction(500);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div[3]/ul/li[1]/div"));
    }

    @When("^User input \"([^\"]*)\" on field nama lengkap$")
    public void user_input_on_field_nama_lengkap(String name) throws Exception {
        waitForAction(500);
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[2]/div/input"), name);
    }

    @When("^User input \"([^\"]*)\" on field email$")
    public void user_input_on_field_email(String email) throws Exception {
        waitForAction(500);
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/input"), email);
    }

    @When("^User input \"([^\"]*)\" on field nomor telepon$")
    public void user_input_on_field_nomor_telepon(String email) throws Exception {
        waitForAction(500);
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[3]/div[2]/div/input"), email);
    }

    @When("^User switch on sama dengan pemesan$")
    public void user_switch_on_sama_dengan_pemesan() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[1]/label/span[2]"));
    }

    @When("^User click button lanjut ke pembayaran$")
    public void user_click_button_lanjut_ke_pembayaran() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[2]/div/div[1]/div/div[5]/button"));
    }

    @When("^User click ya lanjutkan$")
    public void user_click_ya_lanjutkan() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div/div[3]/div/div/div/div/div[3]/button[2]"));
    }

    @Then("^System display metode pembayaran page$")
    public void system_display_metode_pembayaran_page() throws Exception {
        waitForAction(5000);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/h2"));
    }

    @When("^User choose bca virtual account$")
    public void user_choose_bca_virtual_account() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div/a[1]/div/div/span"));
    }

    @Then("^System display total pembayaran is \"([^\"]*)\" on metode pembayaran page$")
    public void system_display_total_pembayaran_is_on_metode_pembayaran_page(String total) throws Exception {
        waitForAction(1000);
        Assert.assertEquals(getValue(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p[2]")), total);
    }

    @Then("^System display bca virtual account details page$")
    public void system_display_bca_virtual_account_details_page() throws Exception {
        waitForAction(5000);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/h2"));
    }

    @Then("^System display total pembayaran is \"([^\"]*)\" on bca virtual account details page$")
    public void system_display_total_pembayaran_is_on_bca_virtual_account_details_page(String total) throws Exception {
        waitForAction(1000);
        Assert.assertEquals(getValue(By.xpath("//*[@id=\"price-tooltip-container\"]/p[2]/span")), total);
    }

    @When("^User click button lanjutkan on bca virtual account details page$")
    public void user_click_button_lanjutkan_on_bca_virtual_account_details_page() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/button"));
    }

    @Then("^System display countdown timer$")
    public void system_display_countdown_timer() throws Exception {
        waitForAction(1500);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[1]/div/div"));
    }

    @When("^User click button saya sudah membayar$")
    public void user_click_button_saya_sudah_membayar() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/button"));
    }

    @When("^User click button ke my order$")
    public void user_click_button_ke_my_order() throws Exception {
        waitForAction(1000);
        waitAndClick(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/div[2]/div/button"));
    }

    @Then("^System display cek pesanan page$")
    public void system_display_cek_pesanan_page() throws Exception {
        waitForAction(3000);
        waitForElementVisible(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div[1]/div/div/form/label"));
    }





}
