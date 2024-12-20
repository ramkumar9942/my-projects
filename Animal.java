interface Animal {

        void speak();}
    
    class Dog implements Animal{
        @Override
        public void speak(){
            System.out.println("bark");
        }

    }
    class AnimalFactory{
    
        public static Animal createAnimal(){
            return new Dog();
            
        }
    
    public static void main(String[] args) {
        Animal dog=AnimalFactory.createAnimal();
        dog.speak();
    }
}
