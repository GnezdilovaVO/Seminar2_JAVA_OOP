public class Horse extends Animal implements Soundable {
    public Horse(String name, String owner) {
        super(name, owner);
    }
    @Override
    public void sound() {
        System.out.println(getClass().getName() + " умеет разговаривать");
    }
    
}
