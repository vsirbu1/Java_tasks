public interface Message {
    String getName();
    void prepareMessage();
    default void messageConverter(String name){
    }

}
