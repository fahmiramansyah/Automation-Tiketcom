package StepDefImpl;

public class Profile {
    private String urlTiketCom = "https://www.tiket.com/";
    private String urlTiketComLogin = "https://www.tiket.com/login";

    public Profile() {
        this.urlTiketComLogin = urlTiketComLogin;
    }

    public String geturlTiketComLogin() {
        return urlTiketComLogin;
    }

    public String geturlurlTiketCom() {
        return urlTiketCom;
    }
}
