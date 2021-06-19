package TemplateMethodPattern;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

    @Override
    protected String doSecurity(String string) {
        System.out.println("decoded");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("is Check id, password");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("Authorization Confirm");
        // 권한 처리 추가, 10시 이후 권한 처리
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("Last Connection Step!");
        return info;
    }
}
