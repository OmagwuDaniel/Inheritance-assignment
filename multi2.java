class cat extends mammals{
    public void details(){
        System.out.println("A cat is an animal");
    }

    public static void main(String[] args){
        cat input = new cat();
        input.display();
        input.show();
        input.details();
    }
}
