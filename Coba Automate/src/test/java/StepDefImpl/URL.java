package StepDefImpl;

import static StepDefImpl.WebUtility.redirectTo;

public class URL {

    private String urlWebsite ="https://www.tiket.com/";
//    private String urlWebsite2 ="https://www.tiket.com/";

    public String getUrlWebsite() {
        return urlWebsite;
    }

    public void getHome() {
        redirectTo(getUrlWebsite());
    }
}
