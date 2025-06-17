package javafoundation.part2_loops;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what's your salary ?");
        int salary = sc.nextInt();

        if (salary < 10000) {
            System.out.println(salary += 2000);
        }
        else if (salary > 10000) {
            System.out.println(salary += 1000);
        }
    }
}
