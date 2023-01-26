/**
 * @class: Chocolate
 * @author: Kim Dinh
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: January 26, 2023
 * description: number of bags that have three chocolates instead of two.
 */
public class Chocolate {
    public static void main(String[] args){
        int bags = 9; //beginning total bags are 9
        int total = 9 * 2; //calculate total chocolate bars
        int bagsNeeded = total / 3; //fill bag with 3 bars
        System.out.println("The number of bags have three chocolate bars is " + bagsNeeded + ".");

    }
}
