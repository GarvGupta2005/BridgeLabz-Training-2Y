public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / students;
        // Calculate remaining pens
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}