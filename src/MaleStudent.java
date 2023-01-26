/**
 * @class: Cycle
 * @author: Kim Dinh
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: January 26, 2023
 * description: compute how many students are male in this middle school.
 */
public class MaleStudent {
    public static void main(String[] args){
        int total = 389; //there are 389 students
        int femaleStudents = 175; //there are 175 female students
        int maleStudents = total - femaleStudents; //take total minus female to get number of male students
        System.out.println("There are " + maleStudents + " in this middle school.");
    }
}
