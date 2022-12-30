public class Turtle extends Okeanrium implements Swimable{

    public Turtle(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("plavaet");
    }
}
