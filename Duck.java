public class Duck extends Animal implements Soundable, Flyable, Swimble{

    public Duck(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("Утка умеет говорить");
        
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName() + " умеет летать");
        
    }

    @Override
    public void swim() {
        System.out.println(getClass().getName() + " умеет плавать");
        
    }
    
}
