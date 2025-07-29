package interview_questions;

public class MNPToLowercaseAlt {
    public static void main(String[] args) {
        String input = "My Name is Pravalika";

        // Replace M, N, and P with their lowercase versions
        String output = input.replace("M", "m")
                             .replace("N", "n")
                             .replace("P", "p");

        System.out.println(output);
    }
}