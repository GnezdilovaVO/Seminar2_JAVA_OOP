public class Cow extends Animal implements Soundable {

    public Cow(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println(getClass().getName() + " умеет говорить");
        
    }
    
}
