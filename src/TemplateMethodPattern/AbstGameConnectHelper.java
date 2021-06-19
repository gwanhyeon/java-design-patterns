package TemplateMethodPattern;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // Template Method
    public String requestConnection(String encodedInfo){
        // 보안작업 -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        //반환된것을 가지고 ID, PASSWORD 할당
        String id = "kgh";
        String password = "kgh";

        if(!authentication(id, password)){
            throw new Error("is not validation id and password");
        }

        String userName = "kgh-User";
        int authorization = authorization(userName);

        switch (authorization){
            case -1:
                throw new Error("after 10 pm Shut Down!");
            case 0:
                System.out.println("game Manager!");
                break;
            case 1:
                System.out.println("Free members");
                break;
            case 2:
                System.out.println("Paid Members");
                break;
            case 3:
                System.out.println("Not authorized");
                break;
            default:
                System.out.println("etc case");
        }
        return connection(decodedInfo);
    }
}
