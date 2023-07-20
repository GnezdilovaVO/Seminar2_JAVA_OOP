public class Fish extends Animal implements Swimble{

    public Fish(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void swim() {
        System.out.println(getClass().getName() + " умеет плавать");
        
    }
    
}
