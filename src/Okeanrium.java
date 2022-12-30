public abstract class Okeanrium {
    private String name;

    public Okeanrium(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Okeanrium{" +
                "name='" + name + '\'' +
                '}';
    }
}
