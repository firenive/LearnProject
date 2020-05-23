package Myrusakov.Chapter3_OOP.AccessMod.Lect;

public class TestPrivate {
    private String valuePriv = "private";
    String valueDef = " default";
    public String valuePub = "public";
    protected String valuePro = "protected";
    protected TestPrivate (String valuePriv, String valueDef, String valuePub, String valuePro) {
        this.valuePriv = valuePriv;
        this.valueDef = valueDef;
        this.valuePub = valuePub;
        this.valuePro = valuePro;
    }

}
