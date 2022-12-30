public class Duck extends Okeanrium implements Swimable {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("plavaet");
    }
}
