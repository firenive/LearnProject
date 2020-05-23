package Myrusakov.Chapter3_OOP.Work.Abstract.Exe;

public class WebMasterAbstract extends UserAbstract {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public WebMasterAbstract(int id, String login, String password, String url) {
        super(id, login, password);
        this.url = url;
    }
    public String getInfo() {
        String s = super.getInfo();
        s += "; URL сайта: " + this.url;
        return s;
    }

    @Override
    public void printUser() {
        System.out.println(getInfo());
    }

    @Override
    public void printUserInterface() {
        System.out.println("interface");
    }
}
