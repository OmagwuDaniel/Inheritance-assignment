class Animal{
    public void show(){
        System.out.println("ANIMALS");
    }
}

class Chicken extends Animal{//single
    public void display(){
        System.out.println("A chicken is an animal");
    }
    public static void main(String[] args) {
        Chicken input=new Chicken();
        input.display();
        input.show();

    }

}
