package Myrusakov.Chapter3_OOP.Extends.Exe;

public class WebMaster extends UserExe {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public WebMaster(int id, String login, String password, String url) {
        super(id, login, password);
        this.url = url;
    }
    public String getInfo() {
        String s = super.getInfo();
        s += "; URL сайта: " + this.url;
        return s;
    }
}
