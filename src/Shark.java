public class  Shark  extends Okeanrium implements Swimable {


    public Shark(String name) {
        super(name);
    }


    @Override
    public void swim() {
        System.out.println("plavaet");
    }
}
