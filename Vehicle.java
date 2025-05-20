class Vehicle{
    String color;
    int speed;
    int size;
    void attributes(){
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
        System.out.println("Size"+size);
    }
}
class Car extends Vehicle{
    int cc;
    int gears;
    void attributescar(){
        System.out.println("Color of Car:"+color);
        System.out.println("Speed of Car:"+speed);
        System.out.println("Size of Car:"+size);
        System.out.println("CC of car:"+cc);
        System.out.println("No.of gears of car:"+gears);
    }
    public static void main(String args[]){
        Car b1 = new Car();
        b1.color = "Blue";
        b1.speed =200;
        b1.size = 22;
        b1.cc = 100;
        b1.gears = 5;
        b1.attributescar();

    }

    }
