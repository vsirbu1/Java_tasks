public abstract class MessageProcessor {

    public void showJson(JsonMessage s)
    {
        System.out.println("Message Type: "+s.getName()+" || Body: "+s.getBody());
    }
    public void showXml(XmlMessage s)
    {
        System.out.println("Message Type: "+s.getName()+" || Body: "+s.getBody());
    }
    public void convertMessage(String s)
    {
        switch(s) {
            case (s=="Json"):
                System.out.println("Message Type: "+s+" || Body: "+XmlMessage.getBody());
        }
    }

}
