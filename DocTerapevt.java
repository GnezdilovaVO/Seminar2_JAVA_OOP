public class DocTerapevt extends Doctor implements AcceptCat, AcceptDog {

    @Override
    public void acceptDog() {
        System.out.println("Принимает собак");
    }

    @Override
    public void acceptCat() {
        System.out.println("Принимает котов");
    }

}
