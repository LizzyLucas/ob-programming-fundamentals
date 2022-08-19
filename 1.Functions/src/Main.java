public class Main {

    public static void main(String[] args) {
        //Part_1
        sum(10, 20, 30);

        //Part_2
        Car myCar = new Car();
        myCar.increaseDoor();
        System.out.println("Number of doors is: "+myCar.numDoor);

    }

    /**
     Part_1
     Create a function with three parameters that are numbers that are added together.
     **/
    public static void sum(int num1, int num2, int num3) {
        int total;
        total = num1 + num2 + num3;
        System.out.println(total);
    }
}

/**
 * //Part 2
 * Create a car class.
 * Inside the car class, a numeric variable that stores the number of doors it has
 * A function that increases the number of doors the car has.
 * Create a myCar object in the main and add a door to it.
 * Show the number of doors the object has.
 */
class Car {
    public int numDoor = 4;

    public void increaseDoor() {
        this.numDoor++;
    }
}