public class Main {
    public static void main(String[] args) {
       Shark shark=new Shark("mama");
       shark.swim();
       Shark shark1=new Shark("pama");
       Shark shark2=new Shark("bama");
       Shark shark3=new Shark("sama");
       Shark shark4=new Shark("fama");
        Duck duck= new Duck("mobic");
        Duck duck1= new Duck("sobic");
        Duck duck3= new Duck("zobic");
        Turtle turtle= new Turtle("jomick");
        Turtle turtle1= new Turtle("pomick");
        Turtle turtle2= new Turtle("lomick");
        Okeanrium [] okeanrium={shark,shark1,shark2,shark3,shark4,duck,duck1,duck3,turtle1,turtle2};
        for (Okeanrium a:okeanrium) {
            System.out.println(a);
        }
        }

    }
