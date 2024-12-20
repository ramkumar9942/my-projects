// this example of builder pattern
public class Car {
    private String model,engine;
    Car(String model,String engine){
        this.engine=engine;
        this.model=model;
    }
    @Override
    public String toString(){
        return "car [model:"+model+",engine:"+engine+"]";
    }
    public static  class CarBuilder{

        
        Car Build(){
            return new Car("tesla","ps4");
        }
    
    }
    public static void main(String[] args) {
        Car car=new CarBuilder().Build();
        System.out.println(car);
    }
    

}
