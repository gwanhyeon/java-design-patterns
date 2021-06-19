package TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("Id Password, etc. Connection Information");
    }

}
