public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            // Check array bounds before accessing
            int index = 2; //Example index. Could be based on user input. 
            if(index >= 0 && index < arr.length){
                System.out.println(arr[index]);
            }else{
                System.out.println("Index out of bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        String str = "Hello"; // Initialize String to prevent null pointer
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        int numerator = 10;
        int denominator = 0; 
        int result = 0;
        //Check for division by zero
        if(denominator !=0){
            result = numerator/denominator;
        }else{
            System.out.println("Cannot divide by zero");
        }
        System.out.println(result);
    }
}