/**
 * @class: Cycle
 * @author: Kim Dinh
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: January 26, 2023
 * description: total number tricycles at the shop.
 */
public class Cycle {
    public static void main(String[] args){
        int numberBicycles = 10; //there are 10 bicycles
        int totalWheels = 47; //there are 47 wheels in total
        int bicyclesWheels = numberBicycles * 2; //each bicycle has 2 wheels
        int tricyclesWheels = totalWheels - bicyclesWheels; //calculate tricycles wheels
        int numberTricycles = tricyclesWheels / 3; //each tricycle has 3 wheels
        System.out.println("Total number of tricycles at the shop is " + numberTricycles + ".");
    }
}
