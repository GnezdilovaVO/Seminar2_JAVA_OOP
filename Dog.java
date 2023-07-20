public class Dog extends Animal implements Soundable, Swimble{
    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println(getClass().getName() + " умеют говорить");
        
    }

    @Override
    public void swim() {
        System.out.println(getClass().getName() + " умеют плавать");
        
    }
}
