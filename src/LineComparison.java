public class LineComparison {
    public void compareLines(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        CalculateLineLength lengthCalculator = new CalculateLineLength();

        // Calculate the lengths of both lines
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        // Compare the lengths
        if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2.");
        } else if (length1 < length2) {
            System.out.println("Line 1 is less than Line 2.");
        } else {
            System.out.println("Both lines are equal.");
        }
    }
}
