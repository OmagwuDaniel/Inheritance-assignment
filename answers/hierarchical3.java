
class Pets extends Animals {
    public void time() {
        System.out.println("let's show pets");
    }
}


class Dog extends Animals {
    public void place() {
        System.out.println("Dog is a mammal");
    }

    public static void main(String[] args) {

        Pets input = new Pets();
        input.show();
        input.time();



        Dog done = new Dog();
        done.show();
        done.place();
    }
}