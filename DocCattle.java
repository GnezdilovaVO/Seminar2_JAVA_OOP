public class DocCattle extends Doctor implements AcceptCow, AcceptHorse{

    @Override
    public void acceptCow() {
        System.out.println("Принимает коров");
        
    }

    @Override
    public void acceptHorse() {
        System.out.println("Принимает лошадей");
        
    }
    
}
