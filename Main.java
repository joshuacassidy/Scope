import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instantiating the Scope class with a new instance called scope.
        Scope scope = new Scope(new Scanner(System.in));
        //Calling the scope function in the scope class by using the new instance of scope.
        scope.scope();
    }
}