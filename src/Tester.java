public class Tester {
    public static void main(String[] args) {

        House house1;
        House house2;

        house1 = new House("via marco polo", 3);
        house2 = new House("via francesco crispi", 4);


        System.out.println("Address of house 1: " + house1.address);
        System.out.println("Number of floors of house 1: " + house1.numberOfFloors);

        System.out.println("Address of house 2: " + house2.address);
        System.out.println("Number of floors of house 2: " + house2.numberOfFloors);
    }

}
