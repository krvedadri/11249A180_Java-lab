class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {

        try {
            int age = 16;

            if (age < 18) {
                throw new AgeException("Age must be 18 or above");
            }

            System.out.println("Eligible to vote");
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}