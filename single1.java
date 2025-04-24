class Animals{
    public void show(){
        System.out.println("ANIMALS");
    }

}



class mammals extends Animals{

        public void display(){
            System.out.println("A mammal is an animal");
        }

        public static void main(String[] args){
            mammals input = new mammals();
            input.display();
            input.show();
        }
    }

