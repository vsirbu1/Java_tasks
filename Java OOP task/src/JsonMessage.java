public class JsonMessage implements Message {

    private String name="JSON";

    private String body;


    public void jsonMessage(String body) {
        this.name = getName();
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public void prepareMessage() {
        System.out.println("Empty field");
    }

    public void prepareMessage(String s) {
        System.out.println(s);
    }

    public void prepareMessage(String s, String s1) {
        System.out.println("Message: "+s+" "+ s1);
    }

}