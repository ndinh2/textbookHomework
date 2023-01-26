/**
 * @class: SpeedLight
 * @author: Kim Dinh
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: January 26, 2023
 * description: calculate the distance to a lightning strike based on the time elapsed between the flash and the sound of thunder.
 */
public class SpeedLight {
    public static void main(String[] args){
        int speed = 340; //speed is 340 meter per second
        int time = 5; //time is 5 seconds
        int distance = speed * time; //distance = speed * time
        System.out.println("The distance is " + distance + " meters.");

    }
}
