/* Smallest of 4 numbers using nested if */
class SmallestOf4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;
        int num4 = 3;

        int smallest;

        // Compare num1 and num2
        if (num1 < num2) {
            smallest = num1;
        } else {
            smallest = num2;
        }

        // Compare smallest with num3
        if (num3 < smallest) {
            smallest = num3;
        }

        // Compare smallest with num4
        if (num4 < smallest) {
            smallest = num4;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}