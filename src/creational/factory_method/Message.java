package Factory_Method;

public  abstract class Message {

    public String content;

    public void addDefaultHeaders(){

    }

    public void encrypt(){

    }

    public String getContent() {
        return content;
    }
}
